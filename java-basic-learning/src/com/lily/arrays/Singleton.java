package com.lily.arrays;

public class Singleton {
	//����ʽ����
	private static Singleton instance=null;
	private Singleton(){}
	public static synchronized Singleton getInstance(){
		if(instance ==null)
			instance=new Singleton();
		return instance;
	}
   //����ʽ����
	public static Singleton getInstance1(){
		return instance;
	}
	

}
