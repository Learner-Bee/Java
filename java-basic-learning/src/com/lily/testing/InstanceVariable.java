package com.lily.testing;

public class InstanceVariable {
    //ʵ������������ɼ�
	public String name;
	//˽�б��������Ӹ���ɼ�
	private double salary;
	//�������ж�name��ֵ�����췽������ͬ�����ķ���
	public InstanceVariable(String empname){
		name=empname;	
	}
	//�趨salaryֵ�ķ���
	public void setSalary(double empsalary){
		salary=empsalary;
	}
	//��ӡ��Ϣ
	public void printEmp(){
		System.out.println("Ա��������"+name);
		System.out.println("Ա�����ʣ�"+salary);
	}
	
	public static void main(String[] args) {
		InstanceVariable IV=new InstanceVariable("lily");
		IV.setSalary(10000);
		IV.printEmp();

	}

}
