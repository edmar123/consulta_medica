package br.com.consultemed.medico.service;

import br.com.consultemed.medico.model.Medico;
import br.com.consultemed.servicoGenerico.ServicoGenerico;
//aqui vao ficar servicos especificos da consulta
//todo crud generico fica na classe genericDAO
public class medicoService extends ServicoGenerico<Medico, Long> {

	public medicoService() {
		super(Medico.class);
	}


}
