package br.com.marydoces.clientemarydoces.pedido.application.service;

import java.util.List;
import java.util.UUID;

import br.com.marydoces.clientemarydoces.pedido.domain.Pedido;

public interface PedidoRepository {
	Pedido salvaPedido(Pedido pedido);
	List<Pedido> buscaPedidosDoClienteComId(UUID idCliente);
}
