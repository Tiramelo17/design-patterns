package com.dio.gof.strategy;

public class Robo {
	
	private Comportamento strategyComportamento;
	
	
	public Robo() {
	}
	
	public Comportamento getStrategyComportamento() {
		return strategyComportamento;
	}



	public void setStrategyComportamento(Comportamento strategyComportamento) {
		this.strategyComportamento = strategyComportamento;
	}


	public void mover() {
		strategyComportamento.mover();
	}

}
