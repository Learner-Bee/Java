package com.lily.littleproject;

import java.util.HashSet;
import java.util.Set;

/**
 * ���ַ����е�һ���ظ����ֵ��ַ����
 * @author Administrator
 *
 */
public class DoubleExist {

	public static void main(String[] args) {
		String a="helloh";
		chongFu(a);
	}
	public static void chongFu(String a){
		Set<Character> set=new HashSet<>();
		char[] b=a.toCharArray();
		for(char x:b){
			if(set.add(x)==false){
				System.out.println("��һ�����ֵ��ظ��ַ�Ϊ"+x);
				//System.out.println("��һ��ֻ����һ�ε��ַ���"+x);
				break;
			}
		}
		//System.out.println("δ�����ظ��ַ�"); û���ظ��ַ�ʱ�����Ӧ��д���ģ�
	}

}
