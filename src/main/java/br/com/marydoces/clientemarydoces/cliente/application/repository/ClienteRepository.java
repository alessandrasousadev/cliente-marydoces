package br.com.marydoces.clientemarydoces.cliente.application.repository;

import java.util.List;

import br.com.marydoces.clientemarydoces.cliente.application.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
	List<Cliente> buscaTodosClientes();

}
