package com.lily.thread;

import javax.print.attribute.standard.PrinterMessageFromOperator;

/**获取当前线程名称
 * 重点：1、当线程执行start（）方法后，就会执行run（）方法 2、执行main方法时，会执行main线程
 * @author Administrator
 *
 */
public class GetName extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			printMsg();
		}
	}
	
	public void printMsg(){
		Thread t=currentThread();
		System.out.println("name="+t.getName());
		}
	
	public static void main(String[] args) {
		GetName g=new GetName();
		g.start();
		//Thread t=currentThread();
		//System.out.println("name="+t.getName());
		//g.printMsg();
		for(int i=0;i<10;i++){
			g.printMsg();		
		}

	}

}
