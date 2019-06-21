package br.com.consultemed.exame.service;

import br.com.consultemed.exame.model.Exame;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

public class ExameService extends ServicoGenerico<Paciente, Long> {

	public ExameService() {
		super(Exame.class);
	}

}
