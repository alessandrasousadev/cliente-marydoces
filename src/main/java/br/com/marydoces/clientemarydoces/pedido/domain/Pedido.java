package br.com.marydoces.clientemarydoces.pedido.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idPedido", updatable = false, unique = true, nullable = false)
	private UUID idPedido;
	@Column(columnDefinition = "uuid", name = "idClientePedido", nullable = false)
	private UUID idClientePedido;
	@Enumerated(EnumType.STRING)
	private Doce doce;
	private int quantidade;
	private LocalDate dataDaEncomenda;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Pedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		this.idClientePedido = idCliente;
		this.doce = pedidoRequest.getDoce();
		this.quantidade = pedidoRequest.getQuantidade();
		this.dataDaEncomenda = pedidoRequest.getDataDaEncomenda();
		this.dataHoraDaUltimaAlteracao = LocalDateTime.now();
		}
}
