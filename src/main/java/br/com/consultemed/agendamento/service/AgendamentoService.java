package br.com.consultemed.agendamento.service;

import br.com.consultemed.agendamento.model.Agendamento;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

public class AgendamentoService extends ServicoGenerico<Paciente, Long>{

	public AgendamentoService() {
		super(Agendamento.class);
	}
	
}
