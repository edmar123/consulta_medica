package br.com.consultemed.email.dao;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.email.model.Email;

public class EmailDAO extends GenericDAO<Email, Long> {

//	@Override
//	protected EntityManager getEntityManager() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public EmailDAO() {
		super(Email.class);
	}

}
