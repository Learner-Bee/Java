package com.lily.littleproject;

import java.util.HashSet;
import java.util.Set;

/**
 * ���ַ����е�һ���ظ����ֵ��ַ����
 * ˼·��
 * 1�����ַ���ת��Ϊ�ַ�����char[] b=a.toCharArray();
 * 2������set���ϲ����ظ����ص㣬���ַ����������ӵ�set������
 * 3����set.add(�ַ�)==falseʱ��˵���Ѿ����ڸ��ַ�����ʱbreak����ѭ����������ַ�
 * @author Administrator
 *
 */
public class DoubleExist {

	public static void main(String[] args) {
		String a="helloh,aabce";
		DoubleExist de=new DoubleExist();
		de.chongFu(a);//��̬��������ֱ�����÷Ǿ�̬��������̬����Ҫ����ʷǾ�̬������Ҫͨ�����ʵ��������
	}
	public  void chongFu(String a){
		Set<Character> set=new HashSet<>();
		char[] b=a.toCharArray();
		for(char x:b){
			if(!set.add(x)){
				System.out.println("��һ�����ֵ��ظ��ַ�Ϊ"+x);
				//System.out.println("��һ��ֻ����һ�ε��ַ���"+x);
				break;
			}
		}
		//System.out.println("δ�����ظ��ַ�"); û���ظ��ַ�ʱ�����Ӧ��д���ģ�
	}

}
