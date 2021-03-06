package com.lily.string;

/**
 * substring()获取子字符串的使用
 * substring(int start)截取start位置到结尾的字符串
 * substring(int begeinindex,int endindex)截取给定范围的字符串。
 * 注意：开始位置包括，但是结尾位置不包括
 * @author Administrator
 *
 */
public class Substring {

	public static void main(String[] args) {
		String str="welcome this nice world";
		
		System.out.println(removeCharAt(str,3));
	    System.out.println(str.substring(0, 3));
		System.out.println(str.substring(2));

	}
	//静态方法直接通过方法名调用方法时，被调用的方法必须声明为静态方法
	//在静态方法A中，通过newB方法的类的对象，通过对象调用B方法。此时B方法可以不是静态的
	public static String removeCharAt(String str,int pos){
		return str.substring(0,pos)+str.substring(pos+1);		
	}
	

}
