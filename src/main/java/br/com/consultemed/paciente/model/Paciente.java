package br.com.consultemed.paciente.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import br.com.consultemed.agendamento.model.Agendamento;
import br.com.consultemed.contato.model.Contato;
import br.com.consultemed.endereco.model.Endereco;
import br.com.consultemed.pessoa.Pessoa;

@Entity
@Table
public class Paciente extends Pessoa {
		
	@OneToOne()
	@JoinColumn(name = "id_endereco")
	@Cascade(CascadeType.PERSIST)
	private Endereco endereco;
	
	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="id_paciente")
	private List<Contato> contatoAcompanhamento;
	
	@OneToOne
	@JoinColumn(name = "id_agendamento")
	private Agendamento agendamento;
	

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Contato> getContatoAcompanhamento() {
		return contatoAcompanhamento;
	}

	public void setContatoAcompanhamento(List<Contato> contatoAcompanhamento) {
		this.contatoAcompanhamento = contatoAcompanhamento;
	}

	public Agendamento getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}

	@Override
	public String toString() {
		return "Paciente [endereco=" + endereco + ", contatoAcompanhamento=" + contatoAcompanhamento + ", agendamento="
				+ agendamento + "]";
	}
	
}
