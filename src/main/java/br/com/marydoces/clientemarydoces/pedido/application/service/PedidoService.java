package br.com.marydoces.clientemarydoces.pedido.application.service;

import java.util.UUID;

import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoRequest;
import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoResponse;
import jakarta.validation.Valid;

public interface PedidoService {
	PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest);

}
