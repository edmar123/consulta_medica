package br.com.consultemed.medico.dao;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.medico.model.Medico;

public class MedicoDao extends GenericDAO<Medico, Long> {
	
	public MedicoDao() {
		super(Medico.class);
	}
	
//	@Override
//	public void remover(Long id) {
//		this.manager.getTransaction().begin();
//		this.manager
//				.createQuery("UPDATE Consulta c SET  c.medico = NULL WHERE c.medico.id = :id") 
//				.setParameter("id", id);
//		
////		this.manager.getTransaction().commit();    
//
//		super.remover(id);
//	}
	
}
