package br.com.stackmob.subsistema2;

public class CepApi {
	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public static String recuperarCidade(String cep) {
		return "Rio de Janceiro";
		
	}
	
	public static String recuperarEstado(String cep) {
		return "RJ-Rio de Janeiro";
	}

}
