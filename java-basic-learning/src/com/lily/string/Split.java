package com.lily.string;

/**
 * 分割字符串split(String regex),参数为正则表达式
 * 
 * @author Lily
 *
 */
public class Split {

	public static void main(String[] args) {
		String str="gg-dd-aa.com";
		//String[] a=str.split("-");
		String[] e=str.split("\\.");
		//String[] b=str.split("\\/");
		//String[] c=str.split("\\|");
		//String[] d=str.split("?|/");
		for(int i=0;i<e.length;i++){
		   System.out.println(e[i]);
		}
	}

}
