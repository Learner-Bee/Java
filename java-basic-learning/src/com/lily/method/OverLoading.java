package com.lily.method;

/**
 * �������������вκ��޲ι��캯����ʹ��
 * @author Administrator
 *
 */
public class OverLoading {

	public static void main(String[] args) {
		MyClass my=new MyClass(3);
		my.info(5);
		my.info("���صķ���");
		new MyClass();

	}

}
 class MyClass{
	int height;
	MyClass(){
		System.out.println("�޲εĹ��캯��");
		int height=4;
	}
	MyClass(int h){
		System.out.println("�вεĹ��캯��");
		System.out.println("¥�ߣ�"+h+" ��");
	}
	void info(int i){
		System.out.println("¥�ߣ�"+i+" ��");
		height=i;
	}
	void info(String s){
		System.out.println(s+"��¥�ߣ�"+height+" ��");
	}
 }


