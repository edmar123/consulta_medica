package br.com.consultemed.email.service;

import br.com.consultemed.email.model.Email;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

public class EmailService extends ServicoGenerico<Paciente, Long> {

	public EmailService() {
		super(Email.class);
	}
	
}
