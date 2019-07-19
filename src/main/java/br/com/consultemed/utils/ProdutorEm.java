package br.com.consultemed.utils;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProdutorEm implements Serializable {

	private static final long serialVersionUID = 1L;

	private  EntityManagerFactory emf = Persistence.createEntityManagerFactory("consultemed");

	@Produces
	public EntityManager createEntityManager() {

		EntityManager em = emf.createEntityManager();

		return em;
	}

	public void close(@Disposes EntityManager em) {
		if (em.isOpen()) {
			em.close();
		}
	}
}
