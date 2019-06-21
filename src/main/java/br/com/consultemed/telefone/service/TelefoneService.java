package br.com.consultemed.telefone.service;

import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.servicoGenerico.ServicoGenerico;
import br.com.consultemed.telefone.model.Telefone;

public class TelefoneService extends ServicoGenerico<Paciente, Long>{

	public TelefoneService() {
		super(Telefone.class);
	}

}
