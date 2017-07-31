package com.lily.arrays;

public class Singleton {
	//懒汉式单例
	private static Singleton instance=null;
	private Singleton(){}
	public static synchronized Singleton getInstance(){
		if(instance ==null)
			instance=new Singleton();
		return instance;
	}
   //饿汉式单例
	public static Singleton getInstance1(){
		return instance;
	}
	

}
