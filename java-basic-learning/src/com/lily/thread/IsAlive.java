package com.lily.thread;

/**
 * �ж��߳��Ƿ���thread.isAlive()
 * @author Administrator
 *
 */
public class IsAlive extends Thread {
	public void run(){
		System.out.println(Thread.currentThread().getName() + "run() method invoked...");
	}
	
	
	public static void main(String[] args) {
		IsAlive is=new IsAlive();
		is.setName("Thread");
		System.out.println(is.getName() +  "�߳��Ƿ�������"+is.isAlive());
		is.start();
		System.out.println(Thread.currentThread().getName() + "�����̺߳�");
		System.out.println(is.getName() + "�߳��Ƿ�������"+is.isAlive());
	}
	
	

}
