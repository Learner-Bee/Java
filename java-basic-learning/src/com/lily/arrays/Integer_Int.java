package com.lily.arrays;

public class Integer_Int {
	public static void main(String[] args){
		Integer a=new Integer(3); //�½�����a����3
		Integer b=3;//��3�Զ�װ���Integer����
		Integer f=3;
		int c=3;
		
		System.out.println(a==b);//false���Ƚϵ����ڴ��ַ����Ϊnew֮���½����ڴ��ַ������ָ����ͬһ������
		System.out.println(b==f);//true.Integer���������ͣ����ԱȽϵ����ڴ��е�����
		System.out.println(a==c);//true��a�Զ������int�ͺ�c�Ƚϡ�ֵ���
		
		System.out.println(Math.round(-12.3));//-12
		System.out.println(Math.round(-12.8));//-13
		System.out.println(Math.round(-12.5));
		System.out.println(Math.round(3.6));
		System.out.println(Math.round(3.3));
		
	}

}
