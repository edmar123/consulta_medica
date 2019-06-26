package br.com.consultemed.paciente.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.consultemed.endereco.model.Endereco;
import br.com.consultemed.medico.model.Medico;
import br.com.consultemed.medico.service.MedicoService;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.paciente.service.PacienteService;
/**
 * Servlet implementation class MedicoServlet
 */
@WebServlet("/paciente")
public class PacienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PacienteService pacienteService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PacienteServlet() {
        super();
        this.pacienteService = new PacienteService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Paciente> pacientesCadastrados = this.pacienteService.listar();
		request.setAttribute("pacientes", pacientesCadastrados);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listagem/lista_paciente.jsp");
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
		String rua = request.getParameter("rua");
		String bairro= request.getParameter("bairro");
		
		
		Paciente paciente = new Paciente();
		paciente.setNome(nome);
		paciente.setCpf(cpf);
		
		Endereco endereco = new Endereco();
		endereco.setBairro(bairro);
		endereco.setRua(rua);
		
		paciente.setEndereco(endereco);
		this.pacienteService.salvar(paciente);
		
	}
	
}
