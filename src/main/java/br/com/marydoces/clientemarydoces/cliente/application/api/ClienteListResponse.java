package br.com.marydoces.clientemarydoces.cliente.application.api;

import java.util.UUID;

import lombok.Value;

@Value
public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String endereco;
	private String celular;

}
