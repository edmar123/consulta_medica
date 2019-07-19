package br.com.consultemed.email.service;

import javax.inject.Inject;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.email.dao.EmailDAO;
import br.com.consultemed.email.model.Email;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

public class EmailService extends ServicoGenerico<Email, Long> {
	
	@Inject
	private EmailDAO emailDao;
	
	public EmailService() {
		super(Email.class);
	}

	@Override
	protected GenericDAO<Email, Long> getDAO() {
		// TODO Auto-generated method stub      
		return emailDao;
	}

//	
}
