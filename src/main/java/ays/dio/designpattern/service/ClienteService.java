package ays.dio.designpattern.service;

import ays.dio.designpattern.model.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void atualizarIdade(Long id, Integer idade);

	void deletar(Long id);

}
