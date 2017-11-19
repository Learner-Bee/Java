package com.lily.string;

/**
 * 字符串翻转string.reverse()方法是将输入流倒序输出。
 * 该方法是StringBuffer下的，String不能使用该方法
 * 所以在输出时，要将StringBuffer转换成String :toString()。
 * 不加toString方法，jvm也会自动调用该方法
 * @author Administrator
 *
 */
public class Reverse {

	public static void main(String[] args) {
		String a="this is a stringbuffer";
		StringBuffer str1=new StringBuffer(a);
		StringBuffer str2=new StringBuffer("这是一个输入流");
		
		System.out.println(str1.reverse());
		System.out.println(str2.reverse().toString());
		
		
	}

}
