package br.com.consultemed.medico.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.consultemed.medico.model.Medico;
import br.com.consultemed.medico.service.MedicoService;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.pessoa.TipoUsuario;
import br.com.consultemed.pessoa.Usuario;

/**
 * Servlet implementation class MedicoServlet
 */
@WebServlet("/medico")
public class MedicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MedicoService medicoService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MedicoServlet() {
		super();
		this.medicoService = new MedicoService();
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

		switch (action) {

		case "listar":
			listarTodos(request, response);
			break;
		case "cadastro":
			prepararParaCadastrar(request, response);
			break;

		default:

			break;
		}
	}

	private void prepararParaCadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = request.getRequestDispatcher("/cadastros/medico.jsp");
		dispatcher.forward(request, response);

	}

	private void listarTodos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Medico> medicosCadastradas = this.medicoService.listar();
		request.setAttribute("medicos", medicosCadastradas);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listagem/lista_medico.jsp");
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

		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String areaAtuacao = request.getParameter("areaAtuacao");

		Medico medico = new Medico();
		medico.setNome(nome);
		medico.setCpf(cpf);
		medico.setAreaAtuacao(areaAtuacao);

		Usuario usuario = new Usuario();
		usuario.setTipoUsuario(TipoUsuario.MEDICO);

		medico.setUsuario(usuario);
		this.medicoService.salvar(medico);
		
		String mensagem = "médico cadastrado com sucesso";
		
		request.setAttribute("mensagem", mensagem);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/cadastros/medico.jsp");
		dispatcher.forward(request, response);

	}

}
