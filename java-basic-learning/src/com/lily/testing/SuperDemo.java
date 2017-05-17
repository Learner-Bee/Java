package com.lily.testing;

public class SuperDemo {

	public static void main(String[] args) {
		new SubClass().showMessage();
	}	
}
class SuperClass{
	int i=50;
}
class SubClass extends SuperClass{
	int i=100;
	public void showMessage(){
		//super引用的是当前对象的父类；this指向的是自己
		System.out.println("super.i= "+super.i+" this.i= "+this.i);
	}
	
}