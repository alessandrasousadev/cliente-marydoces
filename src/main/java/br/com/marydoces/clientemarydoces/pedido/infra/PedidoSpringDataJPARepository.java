package br.com.marydoces.clientemarydoces.pedido.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.marydoces.clientemarydoces.pedido.domain.Pedido;

public interface PedidoSpringDataJPARepository  extends JpaRepository<Pedido, UUID>{

}
