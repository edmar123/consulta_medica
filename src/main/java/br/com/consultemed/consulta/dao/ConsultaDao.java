package br.com.consultemed.consulta.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Query;

import br.com.consultemed.consulta.model.Consulta;
import br.com.consultemed.dao.GenericDAO;

public class ConsultaDao extends GenericDAO<Consulta, Long> {

	public ConsultaDao() {
		super(Consulta.class);
	}
	
	public List<Consulta> buscarPorDataAgendamento(LocalDate agendamento) {
		Query query = this.factory.createQuery("SELECT c FROM Consulta c INNER JOIN c.agendamento as agen WHERE"
				+ " agen.dataAgendamento = :agendamento");
		query.setParameter("agendamento", agendamento);
		List<Consulta> entidades =(List<Consulta>) query.getResultList();
		
		return entidades;
	}
}
