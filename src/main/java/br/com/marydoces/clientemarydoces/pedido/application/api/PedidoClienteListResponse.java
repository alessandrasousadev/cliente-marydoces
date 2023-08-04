package br.com.marydoces.clientemarydoces.pedido.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.marydoces.clientemarydoces.pedido.domain.Doce;
import br.com.marydoces.clientemarydoces.pedido.domain.Pedido;
import lombok.Value;

@Value
public class PedidoClienteListResponse {
	private UUID idPedido;
	private Doce doce;
	private int quantidade;
	private LocalDate dataDaEncomenda;
	
	public static List<PedidoClienteListResponse> converte(List<Pedido> pedidosDoCliente) {
		return pedidosDoCliente.stream()
				.map(PedidoClienteListResponse::new)
				.collect(Collectors.toList());
	}
	
	public PedidoClienteListResponse(Pedido pedido) {
		this.idPedido = pedido.getIdPedido();
		this.doce = pedido.getDoce();
		this.quantidade = pedido.getQuantidade();
		this.dataDaEncomenda = pedido.getDataDaEncomenda();
	}
}
