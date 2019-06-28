package br.com.consultemed.consulta.service;

import java.time.LocalDate;
import java.util.List;

import br.com.consultemed.consulta.dao.ConsultaDao;
import br.com.consultemed.consulta.model.Consulta;
import br.com.consultemed.servicoGenerico.ServicoGenerico;
//aqui vao ficar servicos especificos da consulta
//todo crud generico fica na classe genericDAO
public class ConsultaService extends ServicoGenerico<Consulta, Long> {
	
	private ConsultaDao consultaDao;
	public ConsultaService() {
		super(Consulta.class);
		this.consultaDao = new ConsultaDao();
	}
	
	public List<Consulta> buscarPorDataAgendamento(LocalDate agendamento){
		return this.consultaDao.buscarPorDataAgendamento(agendamento);
	}
	
	public boolean existeConsultaComData(LocalDate dataAgendamento) {
		return this.consultaDao.existeConsultaComData(dataAgendamento);
	}


}
