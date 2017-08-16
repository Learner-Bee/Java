package com.lily.littleproject;

/**
 * static����顢�̳С����캯����ִ��˳��
 * ע������ִ�й�����ǰ�������ȳ�ʼ�������еĳ�Ա�����͹�����
 * @author Administrator
 *
 */
public class Test  {
	
	Person person=new Person("Test");
	//��̬����飬�����ʱִ��һ�Σ���ִֻ��һ��
	static{
		System.out.println("test static");
	}
	public Test(){
		System.out.println("test constructor");
	}

	public static void main(String[] args) {
		new MyClass();//�½�һ��MyClass���ʵ��
		
	}

}

class Person{
	static{
		System.out.println("person static");
	}
	public Person(String str){
		System.out.println("person "+str);
	}
}

class MyClass extends Test{
	Person person=new Person("MyClass");
	static{
		System.out.println("myclass static");
	}
	public MyClass(){
		System.out.println("myclass constructor");
	}
}

