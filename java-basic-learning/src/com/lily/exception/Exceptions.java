package com.lily.exception;

/**
 * 多个异常处理？？？为什么算术异常没有捕获到？？？
 * 1.有几个异常就要有几个catch块
 * 2.如果多个异常出现继承关系，父类异常的catch块写在最下面
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
		System.out.println(array[a]);//制造下标越界异常
		return a/b;//制造算术异常
	}
}
