package br.com.consultemed.servicoGenerico;

import java.io.Serializable;
import java.util.List;

import br.com.consultemed.dao.GenericDAO;

public abstract  class ServicoGenerico<T, G extends Serializable> {
	
	@SuppressWarnings("unused")
	private Class<T> clazz;
	
	@SuppressWarnings("unchecked")
	public ServicoGenerico(Class clazz) {
		this.clazz = clazz;
	}

	protected abstract GenericDAO<T, G> getDAO();

	public List<T> listar() {
		List<T> entidades =  this.getDAO().listar();
		return entidades;
	}

	public void salvar(T entidade) {
		this.getDAO().salvar(entidade);
	}

	public void remover(G id) {
		this.getDAO().remover(id);
	}

	public void editar(T entidade) {
		this.getDAO().editar(entidade);
	}

	public T buscarPorId(G id) {
		return this.getDAO().buscarPorId(id);
	}
}
