package br.com.stackmob.subsistema1;

public class CrmService {
	
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente Cadastrado: ");
		System.out.println(nome +", "+ cidade +", "+ estado +", "+ cep);
	}

}
