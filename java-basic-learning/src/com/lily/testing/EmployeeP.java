package com.lily.testing;

public class EmployeeP {
	//定义私有变量，限制只能在该类中使用
	private String name;
	private String address;
	private int id;
	//创建有参构造函数
	public EmployeeP(String name,String address,int id){
		System.out.println("EmployeeP构造函数");
		this.name=name;
		this.address=address;
		this.id=id;
	}
	public void mailCheck(){
		System.out.println("EmployeeP的mailCheck()方法");
		System.out.println("支票邮寄到:"+name+" "+address);
	}
	//创建getName方法，此处返回的name为全局变量name
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public int getId(){
		return id;
	}

}
