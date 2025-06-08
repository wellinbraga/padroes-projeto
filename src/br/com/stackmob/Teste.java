package br.com.stackmob;

import br.com.stackmob.facade.Facade;
import br.com.stackmob.singleton.SingletonEager;
import br.com.stackmob.singleton.SingletonLazy;
import br.com.stackmob.singleton.SingletonLazyHolder;
import br.com.stackmob.strategy.Comportamento;
import br.com.stackmob.strategy.ComportamentoAgressivo;
import br.com.stackmob.strategy.ComportamentoDefensivo;
import br.com.stackmob.strategy.ComportamentoNormal;
import br.com.stackmob.strategy.Robo;

public class Teste {

	public static void main(String[] args) {

		Facade();
		
		Strategy();
		
		Singleton();
		
		
	}

	private static void Facade() {
		Facade facade = new Facade();
		facade.migrarCliente("Jose Silva", "78400300");
		
	}

	private static void Singleton() {
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		lazy = SingletonLazy.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazyHolder);
	}
	
	
	private static void Strategy() {
		
		Comportamento nomal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new  ComportamentoAgressivo();
		
        Robo robo = new Robo();
        robo.setComportamento(nomal);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
	
        robo.setComportamento(agressivo);
        robo.mover();

}
}
