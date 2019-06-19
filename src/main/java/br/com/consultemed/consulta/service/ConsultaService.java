package br.com.consultemed.consulta.service;

import br.com.consultemed.consulta.model.Consulta;
import br.com.consultemed.servicoGenerico.ServicoGenerico;
//aqui vao ficar servicos especificos da consulta
//todo crud generico fica na classe genericDAO
public class ConsultaService extends ServicoGenerico<Consulta, Long> {

	public ConsultaService() {
		super(Consulta.class);
	}


}
