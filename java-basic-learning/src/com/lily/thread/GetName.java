package com.lily.thread;

import javax.print.attribute.standard.PrinterMessageFromOperator;

/**��ȡ��ǰ�߳�����
 * �ص㣺1�����߳�ִ��start���������󣬾ͻ�ִ��run�������� 2��ִ��main����ʱ����ִ��main�߳�
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
		//main�̵߳�ѭ����g�߳����ѭ������ͬʱ����
		for(int i=0;i<10;i++){
			g.printMsg();		
		}

	}

}