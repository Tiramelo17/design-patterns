package com.dio.gof.singleton;

public class SingletonLazyHodelder {

	private static class InstanceHolder{
		public static SingletonLazyHodelder instancia = new SingletonLazyHodelder();
	}
	
	private SingletonLazyHodelder() {
		super();
	}
	
	public static SingletonLazyHodelder getInstance() {
		return InstanceHolder.instancia;
	}

}
