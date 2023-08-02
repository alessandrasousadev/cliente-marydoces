package br.com.marydoces.clientemarydoces.pedido.application.service;

import br.com.marydoces.clientemarydoces.pedido.domain.Pedido;

public interface PedidoRepository {
	Pedido salvaPedido(Pedido pedido);
}
