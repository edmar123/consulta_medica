package br.com.consultemed.servicoGenerico;

import java.io.Serializable;
import java.util.List;

import br.com.consultemed.dao.GenericDAO;

public class ServicoGenerico<T, G extends Serializable> {

	private GenericDAO<T,G> daoGenerico;
	
	@SuppressWarnings("unused")
	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public ServicoGenerico(Class clazz) {
		this.daoGenerico = new GenericDAO(clazz);
		this.clazz = clazz;
	}
	

	public List<T> listar() {
		List<T> entidades =  this.daoGenerico.listar();
		return entidades;
	}

	public void salvar(T entidade) {
		this.daoGenerico.salvar(entidade);
	}

	public void remover(G id) {
		this.daoGenerico.remover(id);
	}

	public void editar(T entidade) {
		this.daoGenerico.editar(entidade);
	}

	public T buscarPorId(G id) {
		return this.daoGenerico.buscarPorId(id);
	}
}
