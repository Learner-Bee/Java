package com.lily.thread;

/**
 * �ж��߳��Ƿ���thread.isAlive()
 * @author Administrator
 *
 */
public class IsAlive extends Thread {

	public static void main(String[] args) {
		IsAlive is=new IsAlive();
		is.setName("Thread");
		System.out.println("�߳��Ƿ�������"+is.isAlive());
		is.start();
		System.out.println("�����̺߳�");
		System.out.println("�߳��Ƿ�������"+is.isAlive());
	}

}
