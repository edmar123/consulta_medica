package br.com.consultemed.telefone.dao;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.telefone.model.Telefone;

public class TelefoneDAO extends GenericDAO<Paciente, Long> {

	public TelefoneDAO() {
		super(Telefone.class);
	}

}
