package com.lily.string;

/**
 * ����compareTo��String����compareToIgnoreCase(String)���Ƚ��ַ������������ַ�����һ����ĸ��ASCII�Ĳ�ֵ
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
