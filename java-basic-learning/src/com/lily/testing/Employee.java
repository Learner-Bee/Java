package com.lily.testing;

public class Employee {
	String name;
	int empage;
	String empdesignation;
	double empsalary;
	//Employee类构造器
	public Employee(String name){
		this.name=name;
	}
	//设置empage值
	public void empAge(int age){
		empage=age;
	}
	//设置empdesignation值
	public void empDisn(String designation){
		empdesignation=designation;
	}
	//设置empsalary值
	public void empSalary(double salary){
		empsalary=salary;
	}
	//打印信息
	public void printEmployee(){
		System.out.println("员工姓名："+ name);
		System.out.println("员工年龄："+ empage);
		System.out.println("员工职位："+ empdesignation);
		System.out.println("员工薪资: "+ empsalary);
	}
	

	
	

}
