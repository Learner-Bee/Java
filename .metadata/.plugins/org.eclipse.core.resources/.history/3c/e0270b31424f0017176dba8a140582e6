package com.lily.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 1.数组转化为list集合。利用Arrays.asList(数组名)实现
 * 2.集合转化为数组，利用list.toArray()
 * @author Administrator
 *
 */
public class ArraysAsList {

	public static void main(String[] args) {
		//数组转化为集合
		int[] a={2,4,3,1,2};
		List<Integer> list=new ArrayList<>();
		Arrays.asList(a);
		System.out.print("数组转化为集合：");
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
		//集合转化为数组
		List<String> list1=new ArrayList<>();
		list1.add("lily");
		list1.add("love");
		list1.add("mk");
		list1.toArray();
		System.out.print("集合转化为数组：");
		for(String i:list1){
			System.out.print(i+" ");
		}
		//迭代器遍历ArrayList
		Iterator<String> ita=list1.iterator();
		if(ita.hasNext()){
			System.out.println(ita.next());
		}

	}

}
