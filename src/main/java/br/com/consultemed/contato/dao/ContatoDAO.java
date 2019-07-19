package br.com.consultemed.contato.dao;

import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.consultemed.contato.model.Contato;
import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.model.Paciente;

@Named
public class ContatoDAO extends GenericDAO<Contato, Long> {

//	@Override
//	protected EntityManager getEntityManager() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public ContatoDAO() {
		super(Contato.class);
		// TODO Auto-generated constructor stub
	}

}
