package com.lily.littleproject;

import java.util.HashSet;
import java.util.Set;

/**
 * 将字符串中第一个重复出现的字符输出
 * 思路：
 * 1、将字符串转化为字符集合char[] b=a.toCharArray();
 * 2、利用set集合不可重复的特点，将字符逐个遍历添加到set集合中
 * 3、当set.add(字符)==false时，说明已经存在该字符。此时break跳出循环。输出该字符
 * @author Administrator
 *
 */
public class DoubleExist {

	public static void main(String[] args) {
		String a="helloh,aabce";
		DoubleExist de=new DoubleExist();
		de.chongFu(a);//静态方法不能直接引用非静态方法。静态方法要想访问非静态方法就要通过类的实例来引用
	}
	public  void chongFu(String a){
		Set<Character> set=new HashSet<>();
		char[] b=a.toCharArray();
		for(char x:b){
			if(!set.add(x)){
				System.out.println("第一个出现的重复字符为"+x);
				//System.out.println("第一个只出现一次的字符："+x);
				break;
			}
		}
		//System.out.println("未出现重复字符"); 没有重复字符时，输出应该写在哪？
	}

}
