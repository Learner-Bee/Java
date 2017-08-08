package com.lily.arrays;

public class StringReverse {

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
