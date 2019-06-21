package br.com.consultemed.endereco.service;

import br.com.consultemed.endereco.model.Endereco;
import br.com.consultemed.paciente.model.Paciente;
import br.com.consultemed.servicoGenerico.ServicoGenerico;

public class EnderecoService extends ServicoGenerico<Paciente, Long>{

	public EnderecoService() {
		super(Endereco.class);
	}
	
}
