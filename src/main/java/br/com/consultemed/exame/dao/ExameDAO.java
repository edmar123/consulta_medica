package br.com.consultemed.exame.dao;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.exame.model.Exame;

public class ExameDAO extends GenericDAO<Exame, Long>{

//	@Override
//	protected EntityManager getEntityManager() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public ExameDAO() {
		super(Exame.class);
	}

}
