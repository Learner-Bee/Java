package com.lily.testing;

/**
 * 比较静态变量与实例变量的声明周期
 * @author Administrator
 *
 */

public class StaticTest {
	//声明静态变量
    private static int staticint=2;
    //声明实例变量
    private int random=2;
    public StaticTest(){
    	staticint++;
    	random++;
    	System.out.println("staticint="+staticint+" random="+random);
    }
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		StaticTest st1=new StaticTest();
		//st1执行后，静态变量仍存在，但是实例变量随对象销毁而销毁
		//在执行st2时，静态变量继续被使用，但是此时的实例变量为新分配的，所有初始值还是为2
		@SuppressWarnings("unused")
		StaticTest st2=new StaticTest();

	}

}
