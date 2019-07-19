package br.com.consultemed.prontuario.dao;

import javax.persistence.EntityManager;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.prontuario.model.Prontuario;

public class ProntuarioDAO extends GenericDAO<Prontuario, Long>{

//	@Override
//	protected EntityManager getEntityManager() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public ProntuarioDAO() {
		super(Prontuario.class);
	}

}
