package br.com.consultemed.endereco.dao;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.endereco.model.Endereco;
import br.com.consultemed.paciente.model.Paciente;

public class EnderecoDAO extends GenericDAO<Paciente, Long>{

	public EnderecoDAO() {
		super(Endereco.class);
	}

}
