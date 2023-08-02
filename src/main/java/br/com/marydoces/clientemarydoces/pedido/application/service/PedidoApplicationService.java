package br.com.marydoces.clientemarydoces.pedido.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoRequest;
import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class PedidoApplicationService implements PedidoService {

	@Override
	public PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[inicia] PedidoApplicationService - criaPedido");
		log.info("[finaliza] PedidoApplicationService - criaPedido");
		return null;
	}

}
