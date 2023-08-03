package br.com.marydoces.clientemarydoces.pedido.application.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.marydoces.clientemarydoces.cliente.application.service.ClienteService;
import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoClienteListResponse;
import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoRequest;
import br.com.marydoces.clientemarydoces.pedido.application.api.PedidoResponse;
import br.com.marydoces.clientemarydoces.pedido.domain.Pedido;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class PedidoApplicationService implements PedidoService {
	private final ClienteService clienteService;
	private final PedidoRepository pedidoRepository;
	
	@Override
	public PedidoResponse criaPedido(UUID idCliente, @Valid PedidoRequest pedidoRequest) {
		log.info("[inicia] PedidoApplicationService - criaPedido");
		clienteService.buscaClienteAtravesId(idCliente);
		Pedido pedido = pedidoRepository.salvaPedido(new Pedido(idCliente, pedidoRequest));
		log.info("[finaliza] PedidoApplicationService - criaPedido");
		return new PedidoResponse(pedido.getIdPedido());
	}

	@Override
	public List<PedidoClienteListResponse> buscaPedidosDoClienteComId(UUID idCliente) {
		log.info("[inicia] PedidoApplicationService - buscaPedidosDoClienteComId");
		clienteService.buscaClienteAtravesId(idCliente);
		log.info("[finaliza] PedidoApplicationService - buscaPedidosDoClienteComId");
		return null;
	}

}
