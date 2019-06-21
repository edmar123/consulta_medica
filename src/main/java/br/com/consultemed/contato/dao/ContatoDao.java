package br.com.consultemed.contato.dao;

import br.com.consultemed.contato.Contato;
import br.com.consultemed.dao.GenericDAO;

public class ContatoDao extends GenericDAO<Contato, Long> {

	public ContatoDao() {
		super(Contato.class);
	}
	
}
