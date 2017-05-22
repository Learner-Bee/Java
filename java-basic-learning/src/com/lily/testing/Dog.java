package com.lily.testing;

/**
 * Dog类继承Animal类，调用animal中的方法
 * @author Administrator
 *
 */
public class Dog extends Animal {
	public Dog(String myname, int myid) {
		super(myname, myid);
		
	}
	//重写eat方法

	public void eat(){
		super.eat();
		System.out.println(name +" eat  gouliang");
		super.sleep();//通过super关键字调用父类中的方法
	}
	public void bark(){
		System.out.println("狗可以叫");
	}

	public static void main(String[] args){
		//Animal的构造方法有参数，所以此处实例化变量也要传参
		//Animal a=new Animal("animal",2);//Animal对象
		Dog b=new Dog("dog",3);//Dog对象
		//a.eat();//执行Animal类方法
		b.eat();//执行Dog类方法
		b.bark();
		
	
	}
}
