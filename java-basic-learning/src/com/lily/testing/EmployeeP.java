package com.lily.testing;

public class EmployeeP {
	//����˽�б���������ֻ���ڸ�����ʹ��
	private String name;
	private String address;
	private int id;
	//�����вι��캯��
	public EmployeeP(String name,String address,int id){
		System.out.println("EmployeeP���캯��");
		this.name=name;
		this.address=address;
		this.id=id;
	}
	public void mailCheck(){
		System.out.println("EmployeeP��mailCheck()����");
		System.out.println("֧Ʊ�ʼĵ�:"+name+" "+address);
	}
	//����getName�������˴����ص�nameΪȫ�ֱ���name
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public int getId(){
		return id;
	}

}