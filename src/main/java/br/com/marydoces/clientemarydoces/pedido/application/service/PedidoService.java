package br.com.marydoces.clientemarydoces.pedido.application.service;

import java.util.List;
import java.util.UUID;

import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoClienteDetalhadoResponse;
import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoClienteListResponse;
import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoRequest;
import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoResponse;
import jakarta.validation.Valid;

public interface PedidoService {
	PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest);
	List<PedidoClienteListResponse> buscaPedidosDoClienteComId(UUID idCliente);
	PedidoClienteDetalhadoResponse buscaPedidoDoClienteComId(UUID idCliente, UUID idPedido);
	void deletaPedidoDoClienteComId(UUID idCliente, UUID idPedido);
}
