package com.lily.testing;

public class InstanceVariable {
    //实例变量对子类可见
	public String name;
	//私有变量，进队该类可见
	private double salary;
	//构造器中对name赋值。构造方法就是同类名的方法
	public InstanceVariable(String empname){
		name=empname;	
	}
	//设定salary值的方法
	public void setSalary(double empsalary){
		salary=empsalary;
	}
	//打印信息
	public void printEmp(){
		System.out.println("员工姓名："+name);
		System.out.println("员工工资："+salary);
	}
	
	public static void main(String[] args) {
		InstanceVariable IV=new InstanceVariable("lily");
		IV.setSalary(10000);
		IV.printEmp();

	}

}
