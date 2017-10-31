package com.lily.collection;

import java.util.*;

/**
 * 删除集合中指定元素、替换集合中指定元素
 * list.remove()、Collections.replaceAll(list,oldval,newval)
 * @author Administrator
 *
 */
public class CollectionRemove {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("l");
		list.add("i");
		list.add("l");
		list.add("y");
		list.remove("l");//list.remove()删除集合中第一个出现的指定字符。如果没有，集合不变
		System.out.println("删除l后集合为：");
		for(String i:list){
			System.out.println(i);
		}
		//替换集合指定元素
		System.out.println("替换集合中的元素：");
		Collections.replaceAll(list, "l", "o");
		for(String i:list){
			System.out.print(i);
		}

	}
	

}