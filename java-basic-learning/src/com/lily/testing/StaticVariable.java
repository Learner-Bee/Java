package com.lily.testing;

public class StaticVariable {
	//salary�Ǿ�̬��˽�б���
    private static double salary;
    //department��һ������.����public��final����ʱ��������Ӧ��д
    public static final String DEPARTMENT="������Ա";
	public static void main(String[] args) {
		salary=10000;
		System.out.println(DEPARTMENT +"ƽ�����ʣ�"+salary);

	}

}
