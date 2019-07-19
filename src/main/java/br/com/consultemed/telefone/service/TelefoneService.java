package br.com.consultemed.telefone.service;

import javax.inject.Inject;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.servicoGenerico.ServicoGenerico;
import br.com.consultemed.telefone.dao.TelefoneDAO;
import br.com.consultemed.telefone.model.Telefone;

public class TelefoneService extends ServicoGenerico<Telefone, Long>{
	
	@Inject
	private TelefoneDAO telefoneDao;
	
	public TelefoneService() {
		super(Telefone.class);
	}

	@Override
	protected GenericDAO<Telefone, Long> getDAO() {
		// TODO Auto-generated method stub
		return telefoneDao;
	}
}
