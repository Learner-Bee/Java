package com.lily.testing;

/**
 * @author Administrator
 *compareTo()方法使用
 *比较结果定义为int型
 */
public class CompareTo {

	public static void main(String[] args) {
		String str1="string";
		String str2="string";
		String str3="string123";
		int result=str1.compareTo(str2);
		System.out.println(result);
		int result2=str2.compareTo(str3);
		System.out.println(result2);
		int result3=str3.compareTo(str1);
		System.out.println(result3);

	}

}
