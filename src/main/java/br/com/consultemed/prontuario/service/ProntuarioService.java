package br.com.consultemed.prontuario.service;

import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.prontuario.model.Prontuario;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

public class ProntuarioService extends ServicoGenerico<Paciente, Long> {

	public ProntuarioService() {
		super(Prontuario.class);
		// TODO Auto-generated constructor stub
	}

}
