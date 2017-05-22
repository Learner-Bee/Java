package com.lily.testing;

public class Puppy {
	 int Puppyage; //声明一个成员变量
	public Puppy(String name){
		System.out.println("dog's name is "+ name);
	}//构造器，且只有一个参数name
	
	public void setAge(int age){
     Puppyage=age;
	}
	
	public int getAge(){
		System.out.println("dog's age is "+ Puppyage);
		return Puppyage;
	}
	
	public static void main(String[] args) {
		// 创建对象
		Puppy myPuppy=new Puppy("niuniu");
		//通过方法设置age
        myPuppy.setAge(2);
        //调用另一个方法获取age
        myPuppy.getAge();
        //直接访问成员变量
        System.out.println("return value:"+ myPuppy.Puppyage);
	}

}
