package com.lily.testing;

public class SallaryTest {

	public static void main(String[] args) {
		Salary s=new Salary("tmk","hb",1,25000);
		EmployeeP e=new Salary("bll","tj",2,15000);
		System.out.println("ʹ��Salary�����õ���mailCheck");
		s.mailCheck();
		System.out.println("ʹ��Employee�����õ���mailCheck");
		e.mailCheck();

	}

}
