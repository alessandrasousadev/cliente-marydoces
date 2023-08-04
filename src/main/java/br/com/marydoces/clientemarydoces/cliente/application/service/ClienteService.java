package br.com.marydoces.clientemarydoces.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.marydoces.clientemarydoces.cliente.application.api.ClienteAlteracaoRequest;
import br.com.marydoces.clientemarydoces.cliente.application.api.ClienteDetalhadoResponse;
import br.com.marydoces.clientemarydoces.cliente.application.api.ClienteListResponse;
import br.com.marydoces.clientemarydoces.cliente.application.api.ClienteRequest;
import br.com.marydoces.clientemarydoces.cliente.application.api.ClienteResponse;
import jakarta.validation.Valid;

public interface ClienteService {
	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
	void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);
}
