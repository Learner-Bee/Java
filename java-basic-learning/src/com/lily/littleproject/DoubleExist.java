package com.lily.littleproject;

import java.util.HashSet;
import java.util.Set;

/**
 * 将字符串中第一个重复出现的字符输出
 * @author Administrator
 *
 */
public class DoubleExist {

	public static void main(String[] args) {
		String a="helloh";
		chongFu(a);
	}
	public static void chongFu(String a){
		Set<Character> set=new HashSet<>();
		char[] b=a.toCharArray();
		for(char x:b){
			if(set.add(x)==false){
				System.out.println("第一个出现的重复字符为"+x);
				//System.out.println("第一个只出现一次的字符："+x);
				break;
			}
		}
		//System.out.println("未出现重复字符"); 没有重复字符时，输出应该写在哪？
	}

}
