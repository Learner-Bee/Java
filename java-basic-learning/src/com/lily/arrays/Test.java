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
//		System.out.println(str);//为什么输出1234而不是welcome
//		
//		Integer m=new Integer("3");
//		Integer n=3;
//		int x=3;
//		System.out.println(m==n);//false
//		System.out.println(m==x);//true m自动拆箱成int型
//		
//		Integer a1=100,a2=100,b1=150,b2=150;
//		System.out.println(a1==a2);//true.如果整型字面量在-128到127之间，不会new新的Integer对象，而是直接引用常量池中的Integer对象
//		System.out.println(b1==b2);//fasle。在-128到127之外，会新建Integer对象引用
		
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
//		//System.out.println(i==j);//equals是string的方法，其他数据类型不可以用该方法
//		System.out.println();

	}

}
