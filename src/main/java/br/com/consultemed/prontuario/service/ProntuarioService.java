package br.com.consultemed.prontuario.service;

import javax.inject.Inject;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.prontuario.dao.ProntuarioDAO;
import br.com.consultemed.prontuario.model.Prontuario;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

public class ProntuarioService extends ServicoGenerico<Prontuario, Long> {
	
	@Inject
	private ProntuarioDAO prontuarioDao;
	
	public ProntuarioService() {
		super(Prontuario.class);
	}

	@Override
	protected GenericDAO<Prontuario, Long> getDAO() {
		// TODO Auto-generated method stub
		return prontuarioDao;
	}
}
