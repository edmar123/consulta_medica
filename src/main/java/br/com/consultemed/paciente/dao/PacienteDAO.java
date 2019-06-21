package br.com.consultemed.paciente.dao;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.model.Paciente;
//aqui vao ficar daos especificos do paciente
//todo crud generico fica na classe genericDAO
public class PacienteDAO extends GenericDAO<Paciente, Long> {

	public PacienteDAO() {
		super(Paciente.class);
	}

}
