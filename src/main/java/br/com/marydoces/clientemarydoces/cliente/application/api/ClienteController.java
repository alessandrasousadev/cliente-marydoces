package br.com.marydoces.clientemarydoces.cliente.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.marydoces.clientemarydoces.cliente.application.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class ClienteController implements ClienteAPI {
	private final ClienteService clienteService;

	@Override
	public ClienteResponse postCliente(@Valid ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteController - postCliente");
		ClienteResponse clienteCriado =  clienteService.criaCliente(clienteRequest);
		log.info("[finaliza] ClienteController - postCliente");
		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[inicia] ClienteController - getTodosClientes");
		log.info("[finaliza] ClienteController - getTodosClientes");
		return null;
	}

}
