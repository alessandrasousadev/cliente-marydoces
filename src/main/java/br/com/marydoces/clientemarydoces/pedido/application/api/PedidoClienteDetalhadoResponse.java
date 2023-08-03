package br.com.marydoces.clientemarydoces.pedido.application.api;

import java.util.UUID;

import br.com.marydoces.clientemarydoces.pedido.domain.Doce;
import lombok.Value;

@Value
public class PedidoClienteDetalhadoResponse {
	private UUID idPedido;
	private Doce doce;
	private int quantidade;
	

}
