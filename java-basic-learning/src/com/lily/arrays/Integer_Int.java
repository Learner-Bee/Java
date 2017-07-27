package com.lily.arrays;

public class Integer_Int {
	public static void main(String[] args){
		Integer a=new Integer(3); //新建对象a放入3
		Integer b=3;//将3自动装箱成Integer类型
		Integer f=3;
		int c=3;
		
		System.out.println(a==b);//false。比较的是内存地址。因为new之后，新建了内存地址，所以指向不是同一个对象
		System.out.println(b==f);//true.Integer是引用类型，所以比较的是内存中的引用
		System.out.println(a==c);//true。a自动拆箱成int型和c比较。值相等
		
		System.out.println(Math.round(-12.3));//-12
		System.out.println(Math.round(-12.8));//-13
		System.out.println(Math.round(-12.5));
		System.out.println(Math.round(3.6));
		System.out.println(Math.round(3.3));
		
	}

}
