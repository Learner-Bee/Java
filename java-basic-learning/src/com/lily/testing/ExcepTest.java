package com.lily.testing;

/**
 * �����쳣
 * @author Administrator
 *
 */
public class ExcepTest {

	public static void main(String[] args) {
		int a[]={1,2};
		try{
			
			System.out.println("�����������Ϊ��"+a[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception throw :"+e);
		}//try��catch��finally֮�䲻������κδ���飬������ֱ������ʹ��
		finally{
			a[0]=4;
			System.out.println("first element value:"+a[0]);
			System.out.println("the finally statement is executed");
		}
	}

}
