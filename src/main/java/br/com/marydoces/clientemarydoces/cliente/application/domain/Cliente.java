package br.com.marydoces.clientemarydoces.cliente.application.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import br.com.marydoces.clientemarydoces.cliente.application.api.ClienteRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "idcliente", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@CPF
	@Column(unique = true)
	private String cpf;
	@NotBlank
	private String endereco;
	@NotBlank
	private String celular;
	@NotNull
	private LocalDate dataNascimento;
	@NotNull
	private Boolean aceitaTermos;

	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	

	public Cliente(@Valid ClienteRequest clienteRequest) {
		this.nomeCompleto = clienteRequest.getNomeCompleto();
		this.cpf = clienteRequest.getCpf();
		this.endereco = clienteRequest.getEndereco();
		this.celular = clienteRequest.getCelular();
		this.dataNascimento = clienteRequest.getDataNascimento();
		this.aceitaTermos = clienteRequest.getAceitaTermos();
		this.dataHoraDoCadastro = LocalDateTime.now();	
	}	
}
