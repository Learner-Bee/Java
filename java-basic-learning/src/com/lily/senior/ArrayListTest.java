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
		//��һ�֣�ʹ��foreach��������list
		System.out.println("foreach��������");
		for(String str:list){
			System.out.println(str);
		}
		
		//�ڶ��֣��������Ϊ����
		String[] array=new String[list.size()];//�����������ע�⣺�����������������д�С��ֵ����
		list.toArray(array);//������ת��Ϊ���飬�ҷ���array������
		System.out.println("�������Ϊ���������");
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);//ѭ���������array�����е�Ԫ��
		}
		
		//ʹ�õ�����
		System.out.println("ʹ�õ�������������");
		Iterator<String> ite=list.iterator();
		while(ite.hasNext()){//�ж���һ��Ԫ����ֵ
			System.out.println(ite.next());//�����һ��Ԫ��
		}

	}

}
