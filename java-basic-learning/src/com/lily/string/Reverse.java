package com.lily.string;

/**
 * �ַ�����תreverse()�����ǽ����������������
 * �÷�����StringBuffer�µģ�String����ʹ�ø÷���
 * ���������ʱ��Ҫ��StringBufferת����String :toString()
 * @author Administrator
 *
 */
public class Reverse {

	public static void main(String[] args) {
		StringBuffer str1=new StringBuffer("this is a stringbuffer");
		StringBuffer str2=new StringBuffer("����һ��������");
		
		System.out.println(str1.reverse().toString());
		System.out.println(str2.reverse().toString());
		System.out.println(str1);
		
	}

}