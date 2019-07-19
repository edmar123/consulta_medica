package br.com.consultemed.endereco.dao;

import javax.persistence.EntityManager;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.endereco.model.Endereco;

public class EnderecoDAO extends GenericDAO<Endereco, Long>{

//	@Override
//	protected EntityManager getEntityManager() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public EnderecoDAO() {
		super(Endereco.class);
	}

}
