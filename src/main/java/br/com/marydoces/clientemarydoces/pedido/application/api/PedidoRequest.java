package br.com.marydoces.clientemarydoces.pedido.application.api;

import java.time.LocalDate;

import br.com.marydoces.clientemarydoces.pedido.domain.Doce;
import lombok.Value;

@Value
public class PedidoRequest {
	private Doce doce;
	private int quantidade;
	private LocalDate dataDaEncomenda;
}
