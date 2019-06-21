package br.com.consultemed.contato.dao;

import br.com.consultemed.contato.model.Contato;
import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.model.Paciente;

public class ContatoDAO extends GenericDAO<Paciente, Long> {

	public ContatoDAO() {
		super(Contato.class);
		// TODO Auto-generated constructor stub
	}

}
