package br.com.ada.party.service;

import br.com.ada.party.model.TransactionRequest;

public interface TransactionService {

	void transferir(TransactionRequest request);

}
