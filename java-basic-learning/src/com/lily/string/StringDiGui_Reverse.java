package com.lily.string;

/**
 * 递归实现字符串的反转
 * @author Administrator
 *
 */
public class StringDiGui_Reverse {

	public static void main(String[] args) {
		String a="abc";
		System.out.println(reverse(a));
	}
	public static  String  reverse(String str){
		if(str==null||str.length()<=1)
			return str;
		return reverse(str.substring(1))+str.charAt(0);
		
	}

}
