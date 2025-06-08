package br.com.stackmob.singleton;


/**
 *  Singleton "apressado"
 *  
 * @author Wellington
 * 
 */

public class SingletonEager {

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
