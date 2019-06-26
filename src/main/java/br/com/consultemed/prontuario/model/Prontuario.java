package br.com.consultemed.prontuario.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.consultemed.consulta.model.Consulta;
import br.com.consultemed.paciente.model.Paciente;

@Entity
@Table
public class Prontuario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String medicacao;
	
	@OneToOne
	@JoinColumn(name="id_paciente")
	private Paciente paciente;
	
	@OneToMany
	@JoinColumn(name="id_prontuario")
	private List<Consulta> consultas;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMedicacao() {
		return medicacao;
	}

	public void setMedicacao(String medicacao) {
		this.medicacao = medicacao;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public List<Consulta> getConsultas() {
		return consultas;
	}

	public void setConsultas(List<Consulta> consultas) {
		this.consultas = consultas;
	}

	@Override
	public String toString() {
		return "Prontuario [id=" + id + ", medicacao=" + medicacao + ", paciente=" + paciente + "]";
	}
	
}
