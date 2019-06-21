package br.com.consultemed.utils;

import br.com.consultemed.endereco.model.Endereco;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.paciente.service.PacienteService;

public class MainPrincipal {

	public static void main(String[] args) {

		
		System.out.println("Criando um servico de paciente ");
//		
		PacienteService pacienteService = new PacienteService();
//		
		System.out.println("Criando um paciente ");
		Paciente paciente = new Paciente();
		paciente.setNome("Jose silva");
		paciente.setCpf("22332434");

		Endereco endereco =  new Endereco();
		endereco.setBairro("jacare");
		endereco.setRua("rua santo antonio");
		
		paciente.setEndereco(endereco);
		
		System.out.println("Salvando um paciente");
		pacienteService.salvar(paciente);
		System.out.println();
		
		
////		
//		System.out.println(pacientes.get(0));
//		
		
	}

}
