package br.com.marydoces.clientemarydoces.cliente.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.marydoces.clientemarydoces.cliente.application.domain.Cliente;
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
	
	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.cpf = cliente.getCpf();
		this.endereco = cliente.getEndereco();
		this.celular = cliente.getCelular();
		this.dataNascimento = cliente.getDataNascimento();
		this.aceitaTermos = cliente.getAceitaTermos();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	}
}
