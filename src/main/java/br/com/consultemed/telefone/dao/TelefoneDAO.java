package br.com.consultemed.telefone.dao;

import javax.persistence.EntityManager;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.telefone.model.Telefone;

public class TelefoneDAO extends GenericDAO<Telefone, Long> {

//	@Override
//	protected EntityManager getEntityManager() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public TelefoneDAO() {
		super(Telefone.class);
	}

}
