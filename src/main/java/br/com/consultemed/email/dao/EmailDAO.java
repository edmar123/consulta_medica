package br.com.consultemed.email.dao;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.email.model.Email;
import br.com.consultemed.paciente.model.Paciente;

public class EmailDAO extends GenericDAO<Email, Long> {

	public EmailDAO(Email email) {
		super(Email.class);
	}

}
