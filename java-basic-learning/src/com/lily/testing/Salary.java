package com.lily.testing;

public class Salary extends EmployeeP{
	private double salary;
	//父类中创建了有参的构造函数，子类则必须创建构造函数（以子类名字命名，且参数），并且用super(参数)引用父类的构造函数
	public Salary(String name, String address, int id,double salary) {
		super(name, address, id);
		this.salary=salary;
	}
	public void mailCheck(){
		System.out.println("Salary中的mailCheck()方法");
		System.out.println("支票邮寄到:"+getName()+" "+getAddress()+" "+salary);
	}
	

	

}
