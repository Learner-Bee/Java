package com.lily.arrays;

/**
 * �Զ�����װ��
 * �ַ����ͻ����������͵�ת��
 * @author Administrator
 *
 */
public class IntToString {
	public static void main(String[] args){
		Integer a=new Integer(3); //�½�����a����3
		Integer d=new Integer(3);
		Integer b=3;//��3�Զ�װ���Integer����
		Integer f=3;
		int c=3;
		c=f;
		int g=a;
		
		System.out.println(a==b);//false���Ƚϵ����ڴ��ַ����Ϊnew֮���½����ڴ��ַ������ָ����ͬһ������
		System.out.println(b==f);//true.Integer�ǰ�װ���ͣ����ԱȽϵ����ڴ��е�����
		System.out.println(a==c);//true��a�Զ������int�ͺ�c�Ƚϡ�ֵ���
		
		System.out.println(Math.round(-12.3));//-12
		System.out.println(Math.round(-12.8));//-13
		System.out.println(Math.round(-12.5));//-12
		System.out.println(Math.round(3.6));
		System.out.println(Math.round(3.3));
		
		System.out.println(a==d);
		System.out.println(a.equals(d));//Integer������д��equal����
		
		IntToString ii=new IntToString();
		IntToString it=new IntToString();
		System.out.println(ii==it);//false
		System.out.println(ii.equals(it));//false Object�����equals���Ǻ�==�жϵ�һ���������ڴ��ַ
		
		//�ַ����ͻ�����������֮���ת��
		String a1="abc";
	    int i=Integer.parseInt(a1);
	    int j=Integer.valueOf(a1).intValue();
	    //û��intValue()������ǰ��õ���ֻ��һ������a1ֵ��integer����intvalue�����ǵõ�integer�����intֵ
		System.out.println(i);
		System.out.println(j);
		int m=111;
		System.out.println(Integer.toString(c));
		System.out.println(String.valueOf(m));
		
		
 	}

}
