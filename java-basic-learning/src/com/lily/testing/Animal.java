package com.lily.testing;

public class Animal{
    //父类一般没有main方法，因为只供调用，执行入口在子类中
    String name;
	int id;
	public Animal(String myname,int myid){
		name=myname;
		id=myid;
	}
	public  void eat(){
		System.out.println(name+" is eating");
	}
	public void sleep(){
		System.out.println(name+" is sleeping");
	}
	public void introduction(){
		System.out.println("hello!my id is "+id+"name is "+name);
	}

}
