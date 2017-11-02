package com.lily.arrays;

/**
 * 自动拆箱装箱
 * 字符串和基本数据类型的转换
 * @author Administrator
 *
 */
public class IntToString {
	public static void main(String[] args){
		Integer a=new Integer(3); //新建对象a放入3
		Integer d=new Integer(3);
		Integer b=3;//将3自动装箱成Integer类型
		Integer f=3;
		int c=3;
		c=f;
		int g=a;
		
		System.out.println(a==b);//false。比较的是内存地址。因为new之后，新建了内存地址，所以指向不是同一个对象
		System.out.println(b==f);//true.Integer是包装类型，所以比较的是内存中的引用
		System.out.println(a==c);//true。a自动拆箱成int型和c比较。值相等
		
		System.out.println(Math.round(-12.3));//-12
		System.out.println(Math.round(-12.8));//-13
		System.out.println(Math.round(-12.5));//-12
		System.out.println(Math.round(3.6));
		System.out.println(Math.round(3.3));
		
		System.out.println(a==d);
		System.out.println(a.equals(d));//Integer类中重写了equal方法
		
		IntToString ii=new IntToString();
		IntToString it=new IntToString();
		System.out.println(ii==it);//false
		System.out.println(ii.equals(it));//false Object对象的equals就是和==判断的一样，都是内存地址
		
		//字符串和基本数据类型之间的转换
		String a1="abc";
	    int i=Integer.parseInt(a1);
	    int j=Integer.valueOf(a1).intValue();
	    //没有intValue()方法，前面得到的只是一个具有a1值的integer对象，intvalue方法是得到integer对象的int值
		System.out.println(i);
		System.out.println(j);
		int m=111;
		System.out.println(Integer.toString(c));
		System.out.println(String.valueOf(m));
		
		
 	}

}
