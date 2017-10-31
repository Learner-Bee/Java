package com.lily.collection;

import java.util.*;

/**
 * 集合翻转Collections.reverse(listS)、集合循环移动
 * 数组转化为集合：Arrays.asList(数组名)=集合。数组和集合的类型必须一样
 * 
 * @author Administrator
 *
 */
public class ListReverse {

	public static void main(String[] args) {
		Integer[] a={1,2,3,4,5};
		List<Integer> l=new ArrayList<Integer>();
		l=Arrays.asList(a);
		Collections.reverse(l);
		System.out.println("数组转化为list，然后翻转后的内容为：");
		for(int b:l){
		   System.out.print(b+" ");
		}
		System.out.println();
		//集合循环移动
		System.out.println("从index为2的位置循环移动集合：");
		Collections.rotate(l, 2);
		for(Integer c:l){
			System.out.print(c+" ");
		}
		System.out.println();
		//集合最大最小值
		System.out.println("集合中最大的值为："+Collections.max(l));
		System.out.println("集合中最小的值为："+Collections.min(l));

	}

}