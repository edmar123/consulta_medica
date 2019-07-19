package br.com.consultemed.agendamento.dao;

import javax.persistence.EntityManager;

import br.com.consultemed.agendamento.model.Agendamento;
import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.model.Paciente;

public class AgendamentoDAO extends GenericDAO<Agendamento, Long>{

//	@Override
//	protected EntityManager getEntityManager() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public AgendamentoDAO() {
		super(Agendamento.class);
	}

}
