package br.com.consultemed.paciente.service;

import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.servicoGenerico.ServicoGenerico;
//aqui vao ficar daos especificos do paciente
//todo crud generico fica na classe genericDAO
public class PacienteService extends ServicoGenerico<Paciente, Long> {

	public PacienteService() {
		super(Paciente.class);
	}

	


}
