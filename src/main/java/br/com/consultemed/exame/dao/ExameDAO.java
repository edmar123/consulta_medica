package br.com.consultemed.exame.dao;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.exame.model.Exame;
import br.com.consultemed.paciente.model.Paciente;

public class ExameDAO extends GenericDAO<Paciente, Long>{

	public ExameDAO() {
		super(Exame.class);
	}

}
