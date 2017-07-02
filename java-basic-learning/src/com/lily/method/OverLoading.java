package com.lily.method;

/**
 * 方法的重载与有参和无参构造函数的使用
 * @author Administrator
 *
 */
public class OverLoading {

	public static void main(String[] args) {
		MyClass my=new MyClass(3);
		my.info(5);
		my.info("重载的方法");
		new MyClass();

	}

}
 class MyClass{
	int height;
	MyClass(){
		System.out.println("无参的构造函数");
		int height=4;
	}
	MyClass(int h){
		System.out.println("有参的构造函数");
		System.out.println("楼高："+h+" 米");
	}
	void info(int i){
		System.out.println("楼高："+i+" 米");
		height=i;
	}
	void info(String s){
		System.out.println(s+"：楼高："+height+" 米");
	}
 }


