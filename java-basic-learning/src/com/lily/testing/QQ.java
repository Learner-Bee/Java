package com.lily.testing;

public class QQ extends Animal {
	public QQ(String myname, int myid) {
		super(myname, myid);
		
	}

	public static void main(String[] args){
		//Animal�Ĺ��췽���в��������Դ˴�ʵ��������ҲҪ����
		Animal qq=new Animal("ll",2);
		qq.eat();
	
	}
}
