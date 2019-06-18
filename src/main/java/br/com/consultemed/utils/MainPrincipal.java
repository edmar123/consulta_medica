package br.com.consultemed.utils;

import br.com.consultemed.dadosPessoais.DadosPessoais;
import br.com.consultemed.endereco.Endereco;
import br.com.consultemed.paciente.Paciente;
import br.com.consultemed.paciente.service.PacienteService;

public class MainPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		EntityManagerFactory managerFactory= JPAUtils.getEntityManagerFactory();
//		
//		EntityManager manager = managerFactory.createEntityManager();
		
		System.out.println("Criando um servico de paciente ");
//		
		PacienteService pacienteService = new PacienteService();
//		
		System.out.println("Criando um paciente ");
		Paciente paciente = new Paciente();
		
		DadosPessoais dadosPessoais = new DadosPessoais();
		dadosPessoais.setNome("jose soares");
		paciente.setDadosPessoais(dadosPessoais);
				
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
