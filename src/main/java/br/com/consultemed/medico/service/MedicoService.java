package br.com.consultemed.medico.service;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.medico.dao.MedicoDao;
import br.com.consultemed.medico.model.Medico;
import br.com.consultemed.servicoGenerico.ServicoGenerico;
//aqui vao ficar servicos especificos da consulta
//todo crud generico fica na classe genericDAO
public class MedicoService extends ServicoGenerico<Medico, Long> {
	
	@Inject
	private MedicoDao medicoDao;
	
	public MedicoService() {
		super(Medico.class);
	}

	@Override
	protected GenericDAO<Medico, Long> getDAO() {
		// TODO Auto-generated method stub
		return medicoDao;
	}
}
