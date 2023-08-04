package br.com.marydoces.clientemarydoces.pedido.application.api;

import java.time.LocalDate;

import br.com.marydoces.clientemarydoces.pedido.domain.Doce;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class PedidoRequest {
	@NotNull
	private Doce doce;
	@NotNull
	private int quantidade;
	@NotNull
	private LocalDate dataDaEncomenda;
}
