package br.com.consultemed.endereco.service;

import javax.inject.Inject;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.endereco.dao.EnderecoDAO;
import br.com.consultemed.endereco.model.Endereco;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

public class EnderecoService extends ServicoGenerico<Endereco, Long>{
	
	@Inject
	private EnderecoDAO enderecoDao;

	public EnderecoService() {
		super(Endereco.class);
	}
	
	@Override
	protected GenericDAO<Endereco, Long> getDAO() {
		// TODO Auto-generated method stub
		return  this.enderecoDao;
	}

}
