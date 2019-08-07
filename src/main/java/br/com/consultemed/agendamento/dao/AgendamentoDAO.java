package br.com.consultemed.agendamento.dao;

import br.com.consultemed.agendamento.model.Agendamento;
import br.com.consultemed.dao.GenericDAO;

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
