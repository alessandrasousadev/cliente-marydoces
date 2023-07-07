package br.com.marydoces.clientemarydoces.cliente.application.service;

import br.com.marydoces.clientemarydoces.cliente.application.api.ClienteRequest;
import br.com.marydoces.clientemarydoces.cliente.application.api.ClienteResponse;
import jakarta.validation.Valid;

public interface ClienteService {
	ClienteResponse criaCliente(@Valid ClienteRequest clienteRequest);
}
