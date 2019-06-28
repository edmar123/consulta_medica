package br.com.consultemed.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import br.com.consultemed.utils.JPAUtils;

public class GenericDAO<T, G> {

	EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();
	protected EntityManager factory = emf.createEntityManager();
	
	private Class<T> clazz;
	
	public GenericDAO(Class clazz) {
		this.clazz = clazz;// TODO Auto-generated constructor stub
	}
	
//	@SuppressWarnings("unchecked")
//	private final Class<T> entityClass= (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
//				.getActualTypeArguments()[0];

	public List<T> listar() {
		Query query = this.factory.createQuery("FROM " + this.clazz.getSimpleName(), this.clazz);
		List<T> entidades = query.getResultList();
		
		return entidades;
	}

	public void salvar(T entidade) {
		this.factory.getTransaction().begin();
		this.factory.persist(entidade);
		this.factory.getTransaction().commit();
//		this.factory.close();
	} 

	public void remover(G id) {
		this.factory.getTransaction().begin();
		this.factory.remove(this.buscarPorId(id));
		this.factory.getTransaction().commit();
	}

	public void editar(T entidade) {
		this.factory.getTransaction().begin();
		this.factory.merge(entidade);
		this.factory.getTransaction().commit();
		this.factory.close();
	}

	public T buscarPorId(G id) {
//		this.factory.getTransaction().begin();
		T entidadeRemover = this.factory.find(this.clazz, id);
		return entidadeRemover;
	}

}
