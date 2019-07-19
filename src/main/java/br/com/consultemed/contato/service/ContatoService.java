package br.com.consultemed.contato.service;

import javax.inject.Inject;

import br.com.consultemed.contato.dao.ContatoDAO;
import br.com.consultemed.contato.model.Contato;
import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

//@Named
public class ContatoService extends ServicoGenerico<Contato, Long>{

	@Inject
	private ContatoDAO contatoDao;
	
	public ContatoService() {
		super(Contato.class);
	}
	
	@Override
	protected GenericDAO<Contato, Long> getDAO() {
		// TODO Auto-generated method stub
		return contatoDao;
	}
	
}
