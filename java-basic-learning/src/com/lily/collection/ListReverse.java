package com.lily.collection;

import java.util.*;

/**
 * ���Ϸ�תCollections.reverse(listS)������ѭ���ƶ�
 * ����ת��Ϊ���ϣ�Arrays.asList(������)=���ϡ�����ͼ��ϵ����ͱ���һ��
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
		System.out.println("����ת��Ϊlist��Ȼ��ת�������Ϊ��");
		for(int b:l){
		   System.out.print(b+" ");
		}
		System.out.println();
		//����ѭ���ƶ�
		System.out.println("��indexΪ2��λ��ѭ���ƶ����ϣ�");
		Collections.rotate(l, 2);
		for(Integer c:l){
			System.out.print(c+" ");
		}
		System.out.println();
		//���������Сֵ
		System.out.println("����������ֵΪ��"+Collections.max(l));
		System.out.println("��������С��ֵΪ��"+Collections.min(l));

	}

}