package br.com.consultemed.paciente.dao;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.model.Paciente;
//aqui vao ficar daos especificos do paciente
//todo crud generico fica na classe genericDAO
public class PacienteDAO extends GenericDAO<Paciente, Long> {
	
	@Inject
	private static  EntityManager manager;
	
	public PacienteDAO() {
		super(Paciente.class);
	}

//	@Override
//	protected EntityManager getEntityManager() {
//		// TODO Auto-generated method stub
//		return manager;
//	}

}
