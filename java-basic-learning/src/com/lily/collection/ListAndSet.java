package com.lily.collection;

import java.util.*;

/**
 * Set��List�Ķ��ֱ���
 * for��foreach��iterator
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
		set.add("mk");//�ظ���������ʧ��

		//foreach����set
		System.out.println("foreach����set:");
		for(String a:set){
			System.out.print(a+" ");
		}
		System.out.println();
		//iterator����set
		System.out.println("iterator����set:");
		Iterator ita=set.iterator();
		while(ita.hasNext()){
			System.out.print(ita.next()+" ");
		}
		System.out.println();
	}
	
	public static void ListPrint(){
		//List list=new ArrayList();���Բ�����������ͣ��������ӵĲ������ͱ���һ��
		//List l=new ArrayList<Object>();��Ҫ�����������ͬ
		List<String> list=new ArrayList<String>();
		list.add("list");
		list.add("map");
		list.add("map");
		
		//forѭ������List
		System.out.println("forѭ������List:");
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		//foreach����List
		System.out.println("foreach����List:");
		for(String a:list){
			System.out.print(a+" ");
		}
		System.out.println();
		//iterator����List
		System.out.println("iterator����List:");
		Iterator ita=list.iterator();
		while(ita.hasNext()){
			System.out.print(ita.next()+" ");
		}
	}

}