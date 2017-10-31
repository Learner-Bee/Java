package com.lily.collection;

import java.util.*;

/**
 * Set和List的多种遍历
 * for、foreach、iterator
 * @author Administrator
 *
 */
public class ListAndSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetPrint();
		ListPrint();

	}
	public static void SetPrint(){
		Set<String> set=new HashSet<String>();
		set.add("lily");
		set.add("love");
		set.add("mk");
		set.add("mk");//重复数据添加失败

		//foreach遍历set
		System.out.println("foreach遍历set:");
		for(String a:set){
			System.out.print(a+" ");
		}
		System.out.println();
		//iterator遍历set
		System.out.println("iterator遍历set:");
		Iterator ita=set.iterator();
		while(ita.hasNext()){
			System.out.print(ita.next()+" ");
		}
		System.out.println();
	}
	
	public static void ListPrint(){
		//List list=new ArrayList();可以不定义参数类型，但是添加的参数类型必须一致
		//List l=new ArrayList<Object>();不要求参数类型相同
		List<String> list=new ArrayList<String>();
		list.add("list");
		list.add("map");
		list.add("map");
		
		//for循环遍历List
		System.out.println("for循环遍历List:");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		//foreach遍历List
		System.out.println("foreach遍历List:");
		for(String a:list){
			System.out.print(a+" ");
		}
		System.out.println();
		//iterator遍历List
		System.out.println("iterator遍历List:");
		Iterator ita=list.iterator();
		while(ita.hasNext()){
			System.out.print(ita.next()+" ");
		}
	}

}