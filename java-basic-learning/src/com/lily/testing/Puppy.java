package com.lily.testing;

public class Puppy {
	 int Puppyage; //����һ����Ա����
	public Puppy(String name){
		System.out.println("dog's name is "+ name);
	}//����������ֻ��һ������name
	
	public void setAge(int age){
     Puppyage=age;
	}
	
	public int getAge(){
		System.out.println("dog's age is "+ Puppyage);
		return Puppyage;
	}
	
	public static void main(String[] args) {
		// ��������
		Puppy myPuppy=new Puppy("niuniu");
		//ͨ����������age
        myPuppy.setAge(2);
        //������һ��������ȡage
        myPuppy.getAge();
        //ֱ�ӷ��ʳ�Ա����
        System.out.println("return value:"+ myPuppy.Puppyage);
	}

}
