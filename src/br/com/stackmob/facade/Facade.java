package br.com.stackmob.facade;

import br.com.stackmob.subsistema1.CrmService;
import br.com.stackmob.subsistema2.CepApi;

public class Facade {
	
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.recuperarCidade(cep);
		String estado = CepApi.recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}

}
