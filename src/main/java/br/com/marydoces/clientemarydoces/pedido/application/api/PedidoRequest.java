package br.com.marydoces.clientemarydoces.pedido.application.api;

import br.com.marydoces.clientemarydoces.pedido.domain.Doce;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PedidoRequest {
	@NotNull
	private Doce doce;
	@NotNull
	private int quantidade;
}
