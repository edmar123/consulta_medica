package br.com.consultemed.paciente.service;

import javax.inject.Inject;

import br.com.consultemed.dao.GenericDAO;
import br.com.consultemed.paciente.dao.PacienteDAO;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.servicoGenerico.ServicoGenerico;
//aqui vao ficar daos especificos do paciente
//todo crud generico fica na classe genericDAO
//@Named(value="pacienteServiceImpl")
public class PacienteService extends ServicoGenerico<Paciente, Long> {
	
	@Inject
	private  PacienteDAO pacienteDao;
	
	public PacienteService() {
		super(Paciente.class);
	}

	@Override
	protected GenericDAO<Paciente, Long> getDAO() {
		// TODO Auto-generated method stub
		return pacienteDao ;
	}	

}
