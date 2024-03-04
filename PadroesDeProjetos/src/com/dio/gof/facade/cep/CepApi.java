package com.dio.gof.facade.cep;

public class CepApi {
	private static CepApi instancia = new CepApi();
		
		private CepApi() {
			super();
		}
		
		public static CepApi getInstancia() {
			return instancia;
		}
		
		public String recuperarCidade(String Cep) {
			return "Araraquara";
		}
		public String recuperarEstado(String Cep) {
			return "SP";
		}
}
