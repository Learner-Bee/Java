package com.lily.testing;

public class Animal{
    //����һ��û��main��������Ϊֻ�����ã�ִ�������������
    String name;
	int id;
	public Animal(String myname,int myid){
		name=myname;
		id=myid;
	}
	public  void eat(){
		System.out.println(name+" is eating");
	}
	public void sleep(){
		System.out.println(name+" is sleeping");
	}
	public void introduction(){
		System.out.println("hello!my id is "+id+"name is "+name);
	}

}