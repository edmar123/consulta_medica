package br.com.consultemed.medico.dao;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.medico.model.Medico;

public class medicoDao extends GenericDAO<Medico, Long> {

	public medicoDao() {
		super(Medico.class);
	}

}
