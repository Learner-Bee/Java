package com.lily.arrays;

public class Test {
	
	protected int method(int a, int b) { return 0; }
	public static String change(String str){
		str="welcome";
		return str;
	}

	public static void main(String[] args) {
//		String str="1234";
//		change(str);
//		
//		System.out.println(str);//Ϊʲô���1234������welcome
//		
//		Integer m=new Integer("3");
//		Integer n=3;
//		int x=3;
//		System.out.println(m==n);//false
//		System.out.println(m==x);//true m�Զ������int��
//		
//		Integer a1=100,a2=100,b1=150,b2=150;
//		System.out.println(a1==a2);//true.���������������-128��127֮�䣬����new�µ�Integer���󣬶���ֱ�����ó������е�Integer����
//		System.out.println(b1==b2);//fasle����-128��127֮�⣬���½�Integer��������
		
		String a="abc",a3="abc";
		String b=new String("abc");
		String c="a"+"bc";
		System.out.println(a==c);//true
		System.out.println(a==a.intern());//true
//		System.out.println(a==b);//false
//		System.out.println(a.equals(b));//true
//		System.out.println(a.equals(a1));//true
//		System.out.println(a==a1);//true
//		
//		int i=1,j=1;
//		//System.out.println(i==j);//equals��string�ķ����������������Ͳ������ø÷���
//		System.out.println();

	}

}
