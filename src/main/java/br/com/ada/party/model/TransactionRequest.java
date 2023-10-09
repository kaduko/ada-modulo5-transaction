package br.com.ada.party.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class TransactionRequest {
	
	private Long idContaOrigem;
	private Long idContaDestino;
	private Double valor;

}
