package com.lily.string;

/**
 * �ַ�����תstring.reverse()�����ǽ����������������
 * �÷�����StringBuffer�µģ�String����ʹ�ø÷���
 * ���������ʱ��Ҫ��StringBufferת����String :toString()��
 * ����toString������jvmҲ���Զ����ø÷���
 * @author Administrator
 *
 */
public class Reverse {

	public static void main(String[] args) {
		String a="this is a stringbuffer";
		StringBuffer str1=new StringBuffer(a);
		StringBuffer str2=new StringBuffer("����һ��������");
		
		System.out.println(str1.reverse());
		System.out.println(str2.reverse().toString());
		
		
	}

}
