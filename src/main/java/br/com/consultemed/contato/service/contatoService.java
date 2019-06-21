package br.com.consultemed.contato.service;

import br.com.consultemed.contato.model.Contato;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

public class contatoService extends ServicoGenerico<Paciente, Long>{

	public contatoService() {
		super(Contato.class);
	}
	
}
