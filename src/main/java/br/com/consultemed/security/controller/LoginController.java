package br.com.consultemed.security.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.consultemed.security.utils.MensagensValidation;
import br.com.consultemed.usuario.Usuario;
import br.com.consultemed.usuario.service.UsuarioService;
import br.com.consultemed.utils.Constantes;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	@Inject
	private UsuarioService usuarioService;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String logout = req.getParameter("action");
		
		if (logout != null) {
			switch (logout) {
			case "logout":
				this.logout(req, resp);
				break;

			default:

				break;
			}
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/login/login.jsp");
			rd.forward(req, resp);
		}

	}

	private void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();

		if (session != null) {
			session.invalidate();
		}
		resp.sendRedirect(req.getContextPath()+"/login/login.jsp");
		req.setAttribute("ateLogo", "Até logo!");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		final String login = req.getParameter("login");
		final String senha = req.getParameter("senha");

		Map<String, String> mensagem = new HashMap<>();

		if (login.isEmpty()) {
			mensagem.put("login", MensagensValidation.LOGIN_NULO);
		}

		if (senha.isEmpty()) {
			mensagem.put("senha", MensagensValidation.SENHA_NULA);
		}

		if (mensagem.isEmpty()) {
			Usuario usuarioLogado = null;

			usuarioLogado = this.usuarioService.logarNoSistema(login, senha);
			req.getSession().setAttribute("usuarioLogado", usuarioLogado.getLogin());
			RequestDispatcher rd = req.getRequestDispatcher("/");

			rd.forward(req, resp);
			return;
		}
		req.setAttribute("erro", mensagem);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/login/login.jsp");
		dispatcher.forward(req, resp);

	}
}
