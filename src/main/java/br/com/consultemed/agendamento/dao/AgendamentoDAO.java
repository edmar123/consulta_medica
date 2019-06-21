package br.com.consultemed.agendamento.dao;

import br.com.consultemed.agendamento.model.Agendamento;
import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.model.Paciente;

public class AgendamentoDAO extends GenericDAO<Paciente, Long>{

	public AgendamentoDAO() {
		super(Agendamento.class);
	}

}
