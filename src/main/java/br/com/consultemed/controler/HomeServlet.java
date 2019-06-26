package br.com.consultemed.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public HomeServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @throws IOException
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher dispatcher;
		// TODO Auto-generated method stub

		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getParameter("action");

		switch (action) {
		case "medico":
			dispatcher = request.getRequestDispatcher("/cadastros/medico.jsp");
			dispatcher.forward(request, response);
			break;
		case "paciente":
			dispatcher = request.getRequestDispatcher("/cadastros/paciente.jsp");
			dispatcher.forward(request, response);
			break;
		case "agendamento":
			dispatcher = request.getRequestDispatcher("/cadastros/agendamento.jsp");
			dispatcher.forward(request, response);
		case "consulta":
			dispatcher = request.getRequestDispatcher("/cadastros/consulta.jsp");
			dispatcher.forward(request, response);
		// case "/delete":
		// deleteBook(request, response);
		// break;
		// case "/edit":
		// showEditForm(request, response);
		// break;
		// case "/update":
		// updateBook(request, response);
		// break;
		default:
			// listBook(request, response);
			break;
		}
	}

	private void homeCadastros(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/cadastros/medico.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
