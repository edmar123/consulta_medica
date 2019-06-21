package br.com.consultemed.medico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.consultemed.pessoa.Pessoa;

@Entity
@Table
public class Medico extends Pessoa {
	
	@Column(name="area_atuacao")
	private String areaAtuacao;
	
	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	@Override
	public String toString() {
		return "Medico [areaAtuacao=" + areaAtuacao + "]";
	}
	
}
