package com.lily.littleproject;

public class Child extends Parent{

	public static void main(String[] args) {
		Parent p1=new Child();//p1�ܵ���Parent���еķ������ͱ�Child��д�ķ��������ܵ���Child��û�м̳еķ���
		p1.method();
		Parent.method6();
		
		Parent p2=new Parent();//P2ֻ�ܵ���Parent���е�����������ʹ��������д����Ҳ��������д��ķ���
		p2.method();
		
		Child c1=new Child();//c1�ܹ����ø����е����з���������ķ���
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


