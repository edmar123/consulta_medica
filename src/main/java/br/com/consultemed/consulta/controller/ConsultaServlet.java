package br.com.consultemed.consulta.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.id.CompositeNestedGeneratedValueGenerator.GenerationContextLocator;

import br.com.consultemed.agendamento.model.Agendamento;
import br.com.consultemed.consulta.model.Consulta;
import br.com.consultemed.consulta.service.ConsultaService;
import br.com.consultemed.medico.model.Medico;
import br.com.consultemed.medico.service.MedicoService;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.paciente.service.PacienteService;
import br.com.consultemed.utils.ConvertStringToLocalDate;
import net.bytebuddy.agent.builder.AgentBuilder.InitializationStrategy.Dispatcher;

/**
 * Servlet implementation class MedicoServlet
 */
@WebServlet("/consulta")
public class ConsultaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ConsultaService consultaService;
	private MedicoService medicoService;
	private PacienteService pacienteService;
	private String mensagem = "";


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ConsultaServlet() {
		super();
		this.consultaService = new ConsultaService();
		this.medicoService = new MedicoService();
		this.pacienteService = new PacienteService();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getParameter("action");
		
		String buscarPorData = request.getParameter("dataAgendamento");
		
		if (buscarPorData != null) {
			this.consultarPorData(request, response);
		}

		switch (action) {

		case "listar":
			listarTodos(request, response);
			break;
		case "cadastro":
			prepararParaCadastrar(request, response);
			break;
		case "delete":
			deletar(request, response);
			break;
		default:

			break;
		}

	}

	private void consultarPorData(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String dataAgendamento = request.getParameter("dataAgendamento");
		
		LocalDate dataAgendamentoFormatter = ConvertStringToLocalDate.convertToLocalDate(dataAgendamento);

		List<Consulta> consultas = this.consultaService.buscarPorDataAgendamento(dataAgendamentoFormatter);
		
		if (consultas.isEmpty()) {
			String mensagem = "Não há consultas agendadas nesta data";
			request.setAttribute("mensagem", mensagem);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/listagem/lista_consulta.jsp");
			dispatcher.forward(request, response); 
			
			return;
		}
		request.setAttribute("consultas", consultas);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listagem/lista_consulta.jsp");
		dispatcher.forward(request, response); 

	}

	private void deletar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String idConsulta = request.getParameter("id");
		this.consultaService.remover(new Long(idConsulta));	
		response.sendRedirect(request.getContextPath() +"/consulta?action=listar");
	}

	private void prepararParaCadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setAttribute("mensagem", mensagem);

		// listando todos os médicos que podem fazer fazer parte de uma consulta
		List<Medico> medicosCadastrados = this.medicoService.listar();
		request.setAttribute("medicos", medicosCadastrados);

		List<Paciente> pacientesCadastrados = this.pacienteService.listar();
		request.setAttribute("pacientes", pacientesCadastrados);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/cadastros/consulta.jsp");
		dispatcher.forward(request, response);
	}

	private void listarTodos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher;

		List<Consulta> consultasCadastradas = this.consultaService.listar();
		request.setAttribute("consultas", consultasCadastradas);
		dispatcher = request.getRequestDispatcher("/listagem/lista_consulta.jsp");
		dispatcher.forward(request, response);

	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		String descricao = request.getParameter("descricao");
		String dataAgendamento = request.getParameter("dataAgendamento");
		String idMedico = request.getParameter("medico");
		String idPaciente = request.getParameter("paciente");

		Paciente pacienteEncontrado = this.pacienteService.buscarPorId(new Long(idPaciente));
		Medico medicoEncontrado = this.medicoService.buscarPorId(new Long(idMedico));

		Consulta consulta = new Consulta();
		consulta.setDescricao(descricao);
		consulta.setMedico(medicoEncontrado);

		LocalDate dataAgendamentoFormatter = ConvertStringToLocalDate.convertToLocalDate(dataAgendamento);

		Agendamento agendamento = new Agendamento();
		agendamento.setPaciente(pacienteEncontrado);
		agendamento.setDataAgendamento(dataAgendamentoFormatter);

		consulta.setAgendamento(agendamento);
		
		boolean existeConsultaComDataAgendamento= this.consultaService.existeConsultaComData(dataAgendamentoFormatter);
		
		if (existeConsultaComDataAgendamento) {
			mensagem = "Já existe uma consulta para esta data";
//			response.sendRedirect(request.getContextPath() +"/consulta?action=cadastro"); 

		}else {
			consultaService.salvar(consulta);
			mensagem = "médico cadastrado com sucesso";
			
		}
		
		response.sendRedirect(request.getContextPath()+"/consulta?action=cadastro");

	}
}
