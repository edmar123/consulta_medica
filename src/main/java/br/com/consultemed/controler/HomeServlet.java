package br.com.consultemed.controler;

import java.io.IOException;
import java.sql.SQLException;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/cadastros/medico.jsp");
		dispatcher.forward(request, response);
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//		 String action = request.getParameter("action");
//		 
//	        switch (action) {
//			case "cadastros":
//			    homeCadastros(request, response);
//			    break;
////	            case "/insert":
////	                insertBook(request, response);
////	                break;
////	            case "/delete":
////	                deleteBook(request, response);
////	                break;
////	            case "/edit":
////	                showEditForm(request, response);
////	                break;
////	            case "/update":
////	                updateBook(request, response);
////	                break;
//			default:
////	                listBook(request, response);
//			    break;
//			}
	}

	private void homeCadastros(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/cadastros/medico.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
