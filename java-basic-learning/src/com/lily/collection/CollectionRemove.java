package com.lily.collection;

import java.util.*;

/**
 * ɾ��������ָ��Ԫ�ء��滻������ָ��Ԫ��
 * list.remove()��Collections.replaceAll(list,oldval,newval)
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
		list.remove("l");//list.remove()ɾ�������е�һ�����ֵ�ָ���ַ������û�У����ϲ���
		System.out.println("ɾ��l�󼯺�Ϊ��");
		for(String i:list){
			System.out.println(i);
		}
		//�滻����ָ��Ԫ��
		System.out.println("�滻�����е�Ԫ�أ�");
		Collections.replaceAll(list, "l", "o");
		for(String i:list){
			System.out.print(i);
		}

	}
	

}