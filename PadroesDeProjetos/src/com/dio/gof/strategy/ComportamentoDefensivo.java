package com.dio.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{

	
	public ComportamentoDefensivo() {
	}

	@Override
	public void mover() {
		System.out.println("Movendo-se Defensivamente!");
	}

}
