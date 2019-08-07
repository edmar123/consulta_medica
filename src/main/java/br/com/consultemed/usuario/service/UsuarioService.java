package br.com.consultemed.usuario.service;

import javax.inject.Inject;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.servicoGenerico.ServicoGenerico;
import br.com.consultemed.usuario.Usuario;
import br.com.consultemed.usuario.dao.UsuarioDAO;

public class UsuarioService extends ServicoGenerico<Usuario, Long> {
	
	@Inject
	private UsuarioDAO usuarioDao;

	public UsuarioService() {
		super(Usuario.class);
	}

	@Override
	protected GenericDAO<Usuario, Long> getDAO() {
		return usuarioDao;
	}
	
	public Usuario logarNoSistema(final String login, final String senha) {
		return this.usuarioDao.logarNoSistma(login, senha);
	}
	
}
