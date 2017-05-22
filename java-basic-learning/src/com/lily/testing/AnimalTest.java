package com.lily.testing;

import com.lily.util.AnimalIF;

public class AnimalTest implements AnimalIF{
	//由于接口中的方法为抽象方法，所以在实现接口时，必须重写接口中的方法
	public void eat(){
		System.out.println("实现接口的 eat 方法");
	}
	public void travel(){
		System.out.println("实现接口的 travel 方法");
	}
	public void run(){
		System.out.println("实现自己的 run方法");
	}

	public static void main(String[] args) {
		AnimalTest at=new AnimalTest();
		at.eat();
		at.travel();
		at.run();

	}

}
