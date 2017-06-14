package com.lily.thread;

/**
 * 判断线程是否存活thread.isAlive()
 * @author Administrator
 *
 */
public class IsAlive extends Thread {

	public static void main(String[] args) {
		IsAlive is=new IsAlive();
		is.setName("Thread");
		System.out.println("线程是否启动："+is.isAlive());
		is.start();
		System.out.println("启动线程后");
		System.out.println("线程是否启动："+is.isAlive());
	}

}
