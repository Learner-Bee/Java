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
		//super���õ��ǵ�ǰ����ĸ��ࣻthisָ������Լ�
		System.out.println("super.i= "+super.i+" this.i= "+this.i);
	}
	
}