package com.lily.testing;

public class ForTest {

	public static void main(String[] args) {
		int [] numbers={1,2,3,4,5};
		for(int x:numbers){
			if(x==4){
				break;
			}//break��䣬����ѭ���壬ִ��ѭ��������
			System.out.print(x+" ");
			
		}
		System.out.println("\n");
		String [] name={"lily","lucy" ,"mk"};
		for(String y:name){
			if(y=="lucy"){
				continue;
			}//continue��������ѭ����������һ��ѭ��
			System.out.print(y+" ");
		}
		

	}

}
