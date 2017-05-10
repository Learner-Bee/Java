package com.lily.util;

public class Cake {
	private int c;
	public Cake(int c){
		System.out.println("Cake object "+c+" is created");
	}
	protected  void finalize() throws java.lang.Throwable{
		super.finalize();
		System.out.println("Cake object "+ c+" is disposed");
	}
}
