package com.lily.testing;

/**
 * 父类中的有参构造方法，在子类中的super()的引用
 * @author Administrator
 *
 */
public class Super2Test {

		public static void main(String[] args) {
			Suber sb=new Suber();
			Suber sb2=new Suber(200);
			 
		}

	}

 class SuperClass1{
    //无参构造方法
	 SuperClass1(){
	   System.out.println("SuperClass1()");
   }
	 //有参构造方法
	 SuperClass1(int n){
	   System.out.println("SuperClass1(int n): "+n);
	   //this.n=n;
   }
}
 class Suber extends SuperClass1{
	
	Suber(){
		//父类中的有参构造方法子类不能继承，但是子类必须用super（参数）调用父类的有参构造方法
		super(300);
		System.out.println("Suber()");
	}
	Suber(int n){
		
		System.out.println("Suber(int n): "+n);
	}
	 
}


 
