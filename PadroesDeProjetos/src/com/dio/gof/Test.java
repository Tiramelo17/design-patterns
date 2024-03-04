package com.dio.gof;

import com.dio.gof.facade.Facade;
import com.dio.gof.strategy.ComportamentoAgressivo;
import com.dio.gof.strategy.ComportamentoDefensivo;
import com.dio.gof.strategy.ComportamentoNormal;
import com.dio.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {
		ComportamentoAgressivo compAgressivo = new ComportamentoAgressivo();
		ComportamentoDefensivo compDefensivo = new ComportamentoDefensivo();
		ComportamentoNormal compNormal = new ComportamentoNormal();
		
		Robo robo = new Robo();
		
		robo.setStrategyComportamento(compNormal);
		robo.mover();
		robo.setStrategyComportamento(compDefensivo);
		robo.mover();
		robo.setStrategyComportamento(compAgressivo);
		robo.mover();
	
		Facade facade = new Facade();
		facade.migrarCliente("Melo", "32183280");
	
	}

	
	
}
