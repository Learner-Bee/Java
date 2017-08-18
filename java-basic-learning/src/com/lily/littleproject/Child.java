package com.lily.littleproject;

public class Child extends Parent{

	public static void main(String[] args) {
		Parent p1=new Child();//p1能调用Parent类中的方法，和被Child重写的方法。不能调用Child中没有继承的方法
		p1.method();
		Parent.method6();
		
		Parent p2=new Parent();//P2只能调用Parent类中的自身方法。即使被子类重写过，也不调用重写后的方法
		p2.method();
		
		Child c1=new Child();//c1能够调用父类中的所有方法和自身的方法
		c1.method();
		Child.method6();
		
		
	}
	public void method(){
		System.out.println("child override method");
	}
	public void method1(){
		System.out.println("child method1");
	}
	public  void method4(){
		System.out.println("override method4");
	}
	public static void method6(){
		System.out.println("Child override static method6");
	}
}


