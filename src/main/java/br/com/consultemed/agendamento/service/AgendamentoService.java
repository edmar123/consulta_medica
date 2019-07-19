
package br.com.consultemed.agendamento.service;

import javax.inject.Inject;

import br.com.consultemed.agendamento.dao.AgendamentoDAO;
import br.com.consultemed.agendamento.model.Agendamento;
import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

public class AgendamentoService extends ServicoGenerico<Agendamento, Long>{
	
	@Inject
	private AgendamentoDAO agendamentoDao;

	@Override
	protected GenericDAO<Agendamento, Long> getDAO() {
		// 
		return agendamentoDao;
	}

	public AgendamentoService() {
		super(Agendamento.class);
	}
	
}
