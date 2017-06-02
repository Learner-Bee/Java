package com.lily.method;

/**
 * 可变参数的使用在参数类型和参数名间加 ...
 * @author Administrator
 *
 */
public class Varargs {

	public static void main(String[] args) {
	    vaTest(1,3,5);
	    vaTest("布尔型",true,false);

	}
	public static void vaTest(int ... n){
		System.out.println("参数个数："+n.length+" 分别为:");
		for(int i:n){
			System.out.println(i);
		}
	}
	public static void vaTest(String msg,boolean ... n){
		System.out.println(msg+"参数个数："+n.length+" 分别为:");
		for(boolean i:n){
			System.out.println(i);
		}
	}

}
