package com.lily.testing;

public class Salary extends EmployeeP{
	private double salary;
	//�����д������вεĹ��캯������������봴�����캯���������������������Ҳ�������������super(����)���ø���Ĺ��캯��
	public Salary(String name, String address, int id,double salary) {
		super(name, address, id);
		this.salary=salary;
	}
	public void mailCheck(){
		System.out.println("Salary�е�mailCheck()����");
		System.out.println("֧Ʊ�ʼĵ�:"+getName()+" "+getAddress()+" "+salary);
	}
	

	

}