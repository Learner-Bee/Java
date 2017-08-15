package com.lily.littleproject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 数组去重
 * 1、利用set集合元素不重复的特点。将数据元素添加到set集合中，再将set集合转化为数组
 * 2、利用list集合，将集合中不存在的元素添加进去
 * @author Administrator
 *
 */
 public class Quchong_Int2 {
	 static final int x=1;
	 public static void main(String[] args) {
	    	String[] a={"a","b","c","a","b"};
			//Quchong_Int2 qu=new Quchong_Int2();
			System.out.println(quchong2(a));	
	}
	
	//Set集合特点是不能重复
	public static String quchong1(String[] a){		
		Set<String> set=new HashSet<>();
		for(String i:a){
			set.add(i);
		}
		return set.toString();
	}
	//list特点创建时无需定义长度。
	public static String quchong2(String[] a){
		List<String> list=new ArrayList<>();
		for(int i=0;i<a.length;i++){
			if(list.toString().indexOf(a[i])==-1){
				list.add(a[i]);
			}
		}
		return list.toString();
	}

}
//class A{
//	public static void main(String[] args) {
	//	String[] a={"a","b","c","a","b"};
		//Quchong_Int2 qu=new Quchong_Int2();
//		System.out.println(Quchong_Int2.quchong2(a));
	//	Quchong_Int2.x; 

	//}
//}