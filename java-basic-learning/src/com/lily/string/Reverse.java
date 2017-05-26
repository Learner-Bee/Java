package com.lily.string;

/**
 * 字符串翻转reverse()方法是将输入流倒序输出。
 * 该方法是StringBuffer下的，String不能使用该方法
 * 所以在输出时，要将StringBuffer转换成String :toString()
 * @author Administrator
 *
 */
public class Reverse {

	public static void main(String[] args) {
		StringBuffer str1=new StringBuffer("this is a stringbuffer");
		StringBuffer str2=new StringBuffer("这是一个输入流");
		
		System.out.println(str1.reverse().toString());
		System.out.println(str2.reverse().toString());
		System.out.println(str1);
		
	}

}
