package br.com.consultemed.medico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.consultemed.email.Email;
import br.com.consultemed.medico.model.Medico;
import br.com.consultemed.medico.service.medicoService;
import br.com.consultemed.pessoa.TipoUsuario;
import br.com.consultemed.pessoa.Usuario;
import br.com.consultemed.telefone.Telefone;

public class testeMain {

	public static void main(String[] args) {
		
		medicoService medicoService = new medicoService();
		
		System.out.println("criando médico");
		System.out.println();
		Medico medico = new Medico();
		
		medico.setCpf("45454544545");
		medico.setNome("martim silva");
		medico.setAreaAtuacao("neurocirurgia");
		
		Usuario usuario = new Usuario();
		usuario.setTipoUsuario(TipoUsuario.MEDICO);
		
		Email emailPessoal = new Email();
		emailPessoal.setNomeEmail("martim@gmail");
		Email emailTrabalho =new Email();
		emailTrabalho.setNomeEmail("martin@hotmail");
		
		List<Email> emails=Arrays.asList(emailPessoal, emailTrabalho);
		usuario.setEmails(emails);
		
		Telefone telefonePessoal = new Telefone();
		telefonePessoal.setNumero("15645465165");
		
		Telefone telefoneTrabalho= new Telefone();
		
		telefoneTrabalho.setNumero("1213221351");
		
		List<Telefone> telefones = Arrays.asList(telefonePessoal,telefoneTrabalho);
		
		usuario.setTelefones(telefones);
		
		medico.setUsuario(usuario);
		
		System.out.println("salvando medico........");
		medicoService.salvar(medico);

	}

}
