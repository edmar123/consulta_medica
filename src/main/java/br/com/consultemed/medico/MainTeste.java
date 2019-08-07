package br.com.consultemed.medico;

import javax.inject.Inject;

import br.com.consultemed.medico.model.Medico;
import br.com.consultemed.paciente.dao.PacienteDAO;
import br.com.consultemed.paciente.service.PacienteService;

public class MainTeste {

	@Inject
	static PacienteService service;
	@Inject
	static PacienteDAO dao;

	public static void main(String[] args) {

		PacienteDAO dao2 = new PacienteDAO();
		Medico medico = new Medico();

		System.out.println(dao.listar());

	}
}
