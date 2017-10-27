package com.lily.string;

/**
 * 利用compareTo（String）和compareToIgnoreCase(String)来比较字符串，并返回字符串第一个字母的ASCII的差值
 * @author Administrator
 *
 */
public class CompareTo {
	
   
	public static void main(String[] args) {
		
		String str="hello world";
		String str1="HELLO WORLD";
		Object objstr=str;
		
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.compareTo(objstr.toString()));

	}

}
