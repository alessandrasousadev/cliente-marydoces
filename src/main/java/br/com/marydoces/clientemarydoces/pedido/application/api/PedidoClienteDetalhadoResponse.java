package br.com.marydoces.clientemarydoces.pedido.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.marydoces.clientemarydoces.pedido.domain.Doce;
import br.com.marydoces.clientemarydoces.pedido.domain.Pedido;
import lombok.Value;

@Value
public class PedidoClienteDetalhadoResponse {
	
	private UUID idPedido;
	private Doce doce;
	private int quantidade;
	private LocalDate dataDaEncomenda;
	
	public PedidoClienteDetalhadoResponse(Pedido pedido) {
		this.idPedido = pedido.getIdPedido();
		this.doce = pedido.getDoce();
		this.quantidade = pedido.getQuantidade();	
		this.dataDaEncomenda = pedido.getDataDaEncomenda();
		}
}
