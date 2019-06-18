package br.com.consultemed.dadosPessoais;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import br.com.consultemed.email.Email;
import br.com.consultemed.telefone.Telefone;

@Embeddable
public class DadosPessoais {
	
	@Column
	private String nome;
	
	@Column
	private String cpf;
	
	@OneToMany()
	@JoinColumn(name="id_paciente")
	private List<Email> emails;
	
	@OneToMany()
	@JoinColumn(name="id_paciente")
	private List<Telefone> telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}
	
}
