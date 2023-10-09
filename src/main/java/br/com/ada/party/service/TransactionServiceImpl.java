package br.com.ada.party.service;

import org.springframework.stereotype.Service;

import br.com.ada.party.model.TransactionRequest;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Override
	public void transferir(TransactionRequest request) {
		
		//conta vai ser passada no request ??
		//senão necessario usar contarepository pra fazer a busca
		
		
	}

}
