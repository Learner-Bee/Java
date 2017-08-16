package com.lily.littleproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Type_Conversion {

	public static void main(String[] args) {
		// String-->char
		String str1="hello";
		char c1=str1.charAt(0);//获取字符串中指定index的字符
		char[] ch=str1.toCharArray();//将字符串转化为字符数组
		System.out.println(c1);
		System.out.println(ch);
		
		//char-->String
		String str2=Arrays.toString(ch); //将字符数组转为String.这是数组的方法。可以将任意类型的数组转为String类型
		System.out.println(str2);
	    System.out.println(c1+" ");//将字符转为String
	    String str3=String.valueOf(c1);//可以将任意类型转化为String类型
	    String str0=Character.toString(c1);

	    
		//int-->String
	    int m=2;
	    String str4=String.valueOf(m);//将int类型转化为字符串类型
	    String str5=Integer.toString(m);
	    String str6=m+"";
	    
		//String-->int
	    int n=Integer.parseInt(str5);//只能将String类型转化为int类型
	    int n1=Integer.valueOf(str5).intValue();//前面Integer.valueOf(str5)是将字符串转化为Integer对象。后面intValue指返回Integer对象的int值

	    List<Integer> a=new ArrayList<>();
	    
	    StringBuffer s=new StringBuffer("abcdef");
	    //StringBuilder s1=new StringBuilder("234rty8");
	    //s.deleteCharAt(1);//删除某个位置的字符
	    //s.delete(3, 5);//start位置包括在删除范围内，end位置不在删除范围内
	    s.reverse();//将字符反转输出
	    System.out.println(s);
	}

}
