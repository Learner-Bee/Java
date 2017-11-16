package com.lily.string;

/**
 * 判断字符串b是否是字符串a的循环子串
 * 1、a.indexof(b)>=0判断子字符串b在a中的index位置，如果-1说明没有
 * 2、a.contains(b)判断a中是否包含b
 * @author Administrator
 *
 */
public class SubString2 {

	public static void main(String[] args) {
		String sou="ABCAC";
		String dest="CA";
		System.out.println(subStr(sou,dest));
	}
	public static String  subStr(String a ,String b){
		//if(a.indexOf(b)>=0)
		if(a.contains(b))
			return "yes";
		int i=0;
		while(i<a.length()-1){
			a=a.substring(1)+a.charAt(0);
			if(a.indexOf(b)>=0){
				return "yes";//return的意思就是结束整个方法体，返回结果
			}
			i++;
		}
		return "no";
			
		
	}

}
