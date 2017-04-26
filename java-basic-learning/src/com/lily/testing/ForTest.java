package com.lily.testing;

public class ForTest {

	public static void main(String[] args) {
		int [] numbers={1,2,3,4,5};
		for(int x:numbers){
			if(x==4){
				break;
			}//break语句，跳出循环体，执行循环外的语句
			System.out.print(x+" ");
			
		}
		System.out.println("\n");
		String [] name={"lily","lucy" ,"mk"};
		for(String y:name){
			if(y=="lucy"){
				continue;
			}//continue跳出本次循环，进行下一个循环
			System.out.print(y+" ");
		}
		

	}

}
