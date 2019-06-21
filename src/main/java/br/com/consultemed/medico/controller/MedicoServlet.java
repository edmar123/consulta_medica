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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Medico> medicosCadastrados = this.medicoService.listar();
		request.setAttribute("medicos", medicosCadastrados);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listagem/lista_medico.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		String areaAtuacao = request.getParameter("areaAtuacao");
		
		Medico medico = new  Medico();
		medico.setNome(nome);
		medico.setCpf(cpf);
		medico.setAreaAtuacao(areaAtuacao);
		
		this.medicoService.salvar(medico);
		
	}
	
}
