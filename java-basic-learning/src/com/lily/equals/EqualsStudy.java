package com.lily.equals;

/**
 * @author Lily
 *
 */
public class EqualsStudy {

	public static void main(String[] args) {
		
		System.out.println("_______________==_______________");
		
		int a1 = 223;
		Integer a2 = 223;
		Integer a3 = new Integer("223");
		Integer a4 = new Integer(223);
		String a5 = "223";
		
		System.out.println(a1==a2);//true
		System.out.println(a1==a3);//true
		System.out.println(a1==a4);//true
		
		System.out.println(a2==a3);//false
		System.out.println(a2==a4);//false
		
		System.out.println(a3==a4);//false
		
		
		System.out.println("______________");
		A c1 = new A();
		A c2 = new A();
		A c3 = c1;
		B b1 = new B();
		
		System.out.println(c1==c2);//false
		System.out.println(c1==c3);//true
//		System.out.println(c1==b1);//编译不通过，不同类型的实例不能比较
		
		System.out.println("______________equals()______________");
		System.out.println(c1.equals(c2));//
		
	}
}

class A{
	
}

class B{
	
}

class Student{
	
}