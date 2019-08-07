package br.com.consultemed.usuario.dao;

import javax.persistence.Query;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.usuario.Usuario;
//aqui vao ficar daos especificos do paciente
//todo crud generico fica na classe genericDAO
public class UsuarioDAO extends GenericDAO<Usuario, Long> {
	
	public UsuarioDAO() {
		super(Usuario.class);
	}
	
	public Usuario logarNoSistma(final String login, final String senha) {
		Usuario usuario = null;
		
		try {
			
			Query query = this.manager.createQuery("SELECT u FROM Usuario u WHERE u.login "
					+ " = :login AND u.senha = :senha");
					
			query.setParameter("login", login);
			query.setParameter("senha", senha);
			
			usuario = (Usuario) query.getSingleResult();
			
			return usuario;
					
		} catch (Exception e) {
			e.getMessage();
			this.manager.getTransaction().rollback();
			
		}
		
		return usuario;
	}
}
