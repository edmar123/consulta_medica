package br.com.consultemed.consulta.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.consultemed.agendamento.model.Agendamento;
import br.com.consultemed.exame.model.Exame;
import br.com.consultemed.medico.model.Medico;

@Entity
@Table
public class Consulta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private String descricao;
	
	@OneToOne()
	@JoinColumn(name="id_medico" )
	private Medico medico;
	
	@OneToOne(cascade= {CascadeType.PERSIST ,CascadeType.REMOVE}) 
	@JoinColumn(name="id_agendamento")
	private Agendamento agendamento;
	
	@OneToMany(cascade=CascadeType.REMOVE)
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
	public Agendamento getAgendamento() {
		return agendamento;
	}
	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}
	
}
