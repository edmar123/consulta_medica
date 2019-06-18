package br.com.consultemed.consulta.dao;

import br.com.consultemed.consulta.Consulta;
import br.com.consultemed.dao.GenericDAO;

public class ConsultaDao extends GenericDAO<Consulta, Long> {

	public ConsultaDao(Class clazz) {
		super(Consulta.class);
	}

}
