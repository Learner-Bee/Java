package com.lily.string;

import java.util.Arrays;

public class StringtocharArray {

	public static void main(String[] args) {
		String str="hello";
		char[] array=str.toCharArray();
		System.out.println(str);
		
		String str2=Arrays.toString(array);//toString方法里面加了[] ，所以输出时是[h,e,l]
		System.out.println(str2);
		print(array);
	}
	public static void print(char[] array){
		//for(char a:array){
		//	System.out.print(a);
		//}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
	}
}
