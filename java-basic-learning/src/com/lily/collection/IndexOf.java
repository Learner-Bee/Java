package com.lily.collection;

import java.util.*;

/**
 * ���Ҽ������Ƿ����ָ��Ԫ�أ���ָ��Ԫ�ص�λ��
 * @author Administrator
 *
 */
public class IndexOf {

	public static void main(String[] args) {
		List<String> l=new ArrayList<String>();
		l.add("l");
		l.add("i");
		l.add("l");
		l.add("y");
		//List<String> l2=new ArrayList<String>();
		//l2.add("l");
		if(l.indexOf("l")!=-1){
			System.out.println("�����д���ָ��Ԫ��l");
			System.out.println("������ָ��Ԫ�������ֵ�λ��Ϊ��"+l.lastIndexOf("l"));
		}else{
			System.out.println("�����в�����ָ��Ԫ��");
		}

	}

}