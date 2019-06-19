package br.com.consultemed.consulta.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.consultemed.exame.Exame;
import br.com.consultemed.medico.model.Medico;
import br.com.consultemed.prontuario.Prontuario;

@Entity
@Table
public class Consulta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id_medico")
	private Medico medico;
	
	@OneToOne
	@JoinColumn(name="id_prontuario")
	private Prontuario prontuario;
	
	@OneToMany
	@JoinColumn(name="id_consulta")
	private List<Exame> exames;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Prontuario getProntuario() {
		return prontuario;
	}
	public void setProntuario(Prontuario prontuario) {
		this.prontuario = prontuario;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Exame> getExames() {
		return exames;
	}
	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}
	
	
}
