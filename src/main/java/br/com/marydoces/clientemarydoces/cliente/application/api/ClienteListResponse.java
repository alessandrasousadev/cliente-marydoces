package br.com.marydoces.clientemarydoces.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.marydoces.clientemarydoces.cliente.application.domain.Cliente;
import lombok.Value;

@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String endereco;
	private String celular;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return null;
	}

}
