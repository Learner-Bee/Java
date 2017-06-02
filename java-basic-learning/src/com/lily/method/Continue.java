package com.lily.method;

/**
 * continue关键字使用
 * 
 * @author Administrator
 *
 */
public class Continue {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello world");
		char c='a';
		int count=0;
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)!=c){
				continue;
			}else{
				count++;
			}
		}
		System.out.println("字符串中的"+c+"元素总数为："+count);

	}

}
