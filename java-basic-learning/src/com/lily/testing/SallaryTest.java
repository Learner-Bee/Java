package com.lily.testing;

public class SallaryTest {

	public static void main(String[] args) {
		Salary s=new Salary("tmk","hb",1,25000);
		EmployeeP e=new Salary("bll","tj",2,15000);
		System.out.println("使用Salary的引用调用mailCheck");
		s.mailCheck();
		System.out.println("使用Employee的引用调用mailCheck");
		e.mailCheck();

	}

}
