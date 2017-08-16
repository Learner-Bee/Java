package com.lily.littleproject;

/**
 * static代码块、继承、构造函数的执行顺序
 * 注：子类执行构造器前，必须先初始化父类中的成员变量和构造器
 * @author Administrator
 *
 */
public class Test  {
	
	Person person=new Person("Test");
	//静态代码块，类加载时执行一次，且只执行一次
	static{
		System.out.println("test static");
	}
	public Test(){
		System.out.println("test constructor");
	}

	public static void main(String[] args) {
		new MyClass();//新建一个MyClass类的实例
		
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

