package com.lily.testing;

 class SuperClass1{
    //�޲ι��췽��
	 SuperClass1(){
	   System.out.println("SuperClass1()");
   }
	 //�вι��췽��
	 SuperClass1(int n){
	   System.out.println("SuperClass1(int n): "+n);
	   //this.n=n;
   }
}
 class Suber extends SuperClass1{
	
	Suber(){
		//�����е��вι��췽�����಻�ܼ̳У��������������super�����������ø�����вι��췽��
		super(300);
		System.out.println("Suber()");
	}
	Suber(int n){
		
		System.out.println("Suber(int n): "+n);
	}
	 
}
 public class Super2Test {

		public static void main(String[] args) {
			Suber sb=new Suber();
			Suber sb2=new Suber(200);
			 
		}

	}
 