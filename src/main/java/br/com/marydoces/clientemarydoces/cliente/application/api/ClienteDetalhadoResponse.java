package br.com.marydoces.clientemarydoces.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String endereco;
	private String celular;
	private LocalDate dataNascimento;
	private Boolean aceitaTermos;
	private LocalDateTime dataHoraDoCadastro;
}
