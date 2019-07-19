package br.com.consultemed.medico.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.medico.model.Medico;

public class MedicoDao extends GenericDAO<Medico, Long> {
	@Inject
	private   EntityManager manager;

//	@Override
//	protected EntityManager getEntityManager() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	public MedicoDao() {
		super(Medico.class);
	}

}
