package com.lily.method;

/**
 * �ɱ������ʹ���ڲ������ͺͲ�������� ...
 * @author Administrator
 *
 */
public class Varargs {

	public static void main(String[] args) {
	    vaTest(1,3,5);
	    vaTest("������",true,false);

	}
	public static void vaTest(int ... n){
		System.out.println("����������"+n.length+" �ֱ�Ϊ:");
		for(int i:n){
			System.out.println(i);
		}
	}
	public static void vaTest(String msg,boolean ... n){
		System.out.println(msg+"����������"+n.length+" �ֱ�Ϊ:");
		for(boolean i:n){
			System.out.println(i);
		}
	}

}