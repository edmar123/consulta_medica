package br.com.consultemed.prontuario.dao;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.prontuario.model.Prontuario;

public class ProntuarioDAO extends GenericDAO<Paciente, Long>{

	public ProntuarioDAO(Prontuario prontuario) {
		super(Prontuario.class);
	}

}
