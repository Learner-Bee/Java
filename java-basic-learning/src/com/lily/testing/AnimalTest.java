package com.lily.testing;

import com.lily.util.AnimalIF;

public class AnimalTest implements AnimalIF{
	//���ڽӿ��еķ���Ϊ���󷽷���������ʵ�ֽӿ�ʱ��������д�ӿ��еķ���
	public void eat(){
		System.out.println("ʵ�ֽӿڵ� eat ����");
	}
	public void travel(){
		System.out.println("ʵ�ֽӿڵ� travel ����");
	}
	public void run(){
		System.out.println("ʵ���Լ��� run����");
	}

	public static void main(String[] args) {
		AnimalTest at=new AnimalTest();
		at.eat();
		at.travel();
		at.run();

	}

}
