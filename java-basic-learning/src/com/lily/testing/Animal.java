package com.lily.testing;

/**
 * Animal父类，定义一些animal通用方法
 * @author Administrator
 *
 */
public class Animal{
    //父类一般没有main方法，因为只供调用，执行入口在子类中
    String name;
	int id;
	//有参的构造方法。在子类中，必须通过super（参数）调用父类的构造方法
	public Animal(String myname,int myid){
		name=myname;
		id=myid;
	}
	public  void eat(){
		System.out.println(name+" can eat");
	}
	public void sleep(){
		System.out.println(name+" is sleeping");
	}
	public void introduction(){
		System.out.println("hello!my id is "+id+"name is "+name);
	}

}
