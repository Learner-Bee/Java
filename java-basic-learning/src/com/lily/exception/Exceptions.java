package com.lily.exception;

/**
 * ����쳣����������Ϊʲô�����쳣û�в��񵽣�����
 * 1.�м����쳣��Ҫ�м���catch��
 * 2.�������쳣���ּ̳й�ϵ�������쳣��catch��д��������
 * @author Administrator
 *
 */
public class Exceptions {

	public static void main(String[] args) {
		Demo d=new Demo();
		try{
		    int x=d.method(4, 0);
		    System.out.println("x= "+x);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.toString());
		}
		catch(Exception e){
			System.out.println("toString()"+e);
		}
		System.out.println("over");
		

	}

}
class Demo{
	public static int method(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException {
		int[] array=new int[a];
		System.out.println(array[a]);//�����±�Խ���쳣
		return a/b;//���������쳣
	}
}