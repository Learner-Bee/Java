package com.lily.senior;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("lily");
		//第一种：使用foreach方法遍历list
		System.out.println("foreach遍历链表：");
		for(String str:list){
			System.out.println(str);
		}
		
		//第二种：把链表变为数组
		String[] array=new String[list.size()];//声明数组对象，注意：声明的数组对象必须有大小或赋值？？
		list.toArray(array);//将链表转化为数组，且放在array数组中
		System.out.println("把链表变为数组遍历：");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);//循环遍历输出array数组中的元素
		}
		
		//使用迭代器
		System.out.println("使用迭代器遍历链表：");
		Iterator<String> ite=list.iterator();
		while(ite.hasNext()){//判断下一个元素有值
			System.out.println(ite.next());//输出下一个元素
		}

	}

}
