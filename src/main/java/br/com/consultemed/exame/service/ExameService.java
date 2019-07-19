package br.com.consultemed.exame.service;

import javax.inject.Inject;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.exame.dao.ExameDAO;
import br.com.consultemed.exame.model.Exame;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

public class ExameService extends ServicoGenerico<Exame, Long> {
	
	@Inject
	private ExameDAO exameDao;
	
	public ExameService() {
		super(Exame.class);
	}

	@Override
	protected GenericDAO<Exame, Long> getDAO() {
		// TODO Auto-generated method stub
		return exameDao;
	}
	
}
