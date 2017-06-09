package com.lily.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 1.����ת��Ϊlist���ϡ�����Arrays.asList(������)ʵ��
 * 2.����ת��Ϊ���飬����list.toArray()
 * @author Administrator
 *
 */
public class ArraysAsList {

	public static void main(String[] args) {
		//����ת��Ϊ����
		int[] a={2,4,3,1,2};
		List<Integer> list=new ArrayList<>();
		Arrays.asList(a);
		System.out.print("����ת��Ϊ���ϣ�");
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println();
		//����ת��Ϊ����
		List<String> list1=new ArrayList<>();
		list1.add("lily");
		list1.add("love");
		list1.add("mk");
		list1.toArray();
		System.out.print("����ת��Ϊ���飺");
		for(String i:list1){
			System.out.print(i+" ");
		}
		//����������ArrayList
		Iterator<String> ita=list1.iterator();
		if(ita.hasNext()){
			System.out.println(ita.next());
		}

	}

}
