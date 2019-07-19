package br.com.consultemed.dao;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;


public  class GenericDAO<T , G> implements Serializable  {
	
    private static final long serialVersionUID = 1L;  
//	protected EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
//	@Inject
	
	private Class<T> clazz;
	
	@Inject
	protected  EntityManager manager ;   
	
	public GenericDAO(Class clazz) {
		this.clazz = clazz;
//		manager = manager;
	}
	
//	public GenericDAO() {
//		
//	}
	
//	protected abstract EntityManager  getEntityManager();

	public List<T> listar() {
		Query query = this.manager.createQuery(" FROM " + this.clazz.getSimpleName(), this.clazz);
		List<T> entidades = query.getResultList();

		return entidades;
	}

	public void salvar(T entidade) {
		// this.manager.getTransaction().begin();
		this.manager.persist(entidade);
//		this.manager().getTransaction().commit();
		// this.factory.close();
	}

	public void remover(G id) {		
		T entity = this.manager.find(this.clazz,id);
		
		if (this.manager.contains(entity)) {
			
			System.out.println("Gerenciavel");
		}else {
			
			System.out.println("detached");
		}
		this.manager.remove(entity); 

	}

	public void editar(T entidade) {
		this.manager.merge(entidade);
	}

	public T buscarPorId(G id) {
		T entidadeRemover = this.manager.find(this.clazz, id);
		return entidadeRemover;
	}

}
