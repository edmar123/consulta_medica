package br.com.consultemed.consulta.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.consultemed.agendamento.model.Agendamento;
import br.com.consultemed.consulta.model.Consulta;
import br.com.consultemed.consulta.service.ConsultaService;
import br.com.consultemed.medico.model.Medico;
import br.com.consultemed.medico.service.MedicoService;
/**
 * Servlet implementation class MedicoServlet
 */
@WebServlet("/consulta")
public class ConsultaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ConsultaService consultaService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultaServlet() {
        super();
        this.consultaService = new ConsultaService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		List<Medico> medicosCadastrados = this.medicoService.listar();
//		request.setAttribute("medicos", medicosCadastrados);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/listagem/lista_medico.jsp");
//		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String descricao = request.getParameter("descricao");
		String dataAgendamento = request.getParameter("dataAgendamento");
		
		Consulta consulta = new Consulta();
		consulta.setDescricao(descricao);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		//convert String to LocalDate
		LocalDate dataAgendamentoFormatter = LocalDate.parse(dataAgendamento, formatter);
		
		Agendamento agendamento = new Agendamento();
		agendamento.setDataAgendamento(dataAgendamentoFormatter);
		
		consulta.setAgendamento(agendamento);
		
		consultaService.salvar(consulta);
		
	}
	
}
