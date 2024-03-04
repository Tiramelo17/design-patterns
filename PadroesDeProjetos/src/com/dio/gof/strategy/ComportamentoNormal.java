package com.dio.gof.strategy;

public class ComportamentoNormal implements Comportamento{

	
	public ComportamentoNormal() {
	}

	@Override
	public void mover() {
		System.out.println("Movendo-se Normalmente!");
	}

}
