package com.dio.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{

	
	public ComportamentoAgressivo() {
	}

	@Override
	public void mover() {
		System.out.println("Movendo-se Agressivamente!");
	}

}
