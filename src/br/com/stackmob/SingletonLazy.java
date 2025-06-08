package br.com.stackmob;


/**
 *  Singleton prequi�oso
 *  
 * @author Wellington
 * 
 */

public class SingletonLazy {

	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		
		return instancia;
	}
}
