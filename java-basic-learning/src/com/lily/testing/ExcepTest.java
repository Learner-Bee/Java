package com.lily.testing;

/**
 * 捕获异常
 * @author Administrator
 *
 */
public class ExcepTest {

	public static void main(String[] args) {
		int a[]={1,2};
		try{
			
			System.out.println("数组第三个数为："+a[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception throw :"+e);
		}//try、catch、finally之间不能添加任何代码块，必须是直接连续使用
		finally{
			a[0]=4;
			System.out.println("first element value:"+a[0]);
			System.out.println("the finally statement is executed");
		}
	}

}
