package com.lily.thread;

import java.io.IOException;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

/**
 * �߳���ֹ
 * @author Administrator
 *
 */
public class ThreadInterrupt extends Thread {
	public void run(){
		try{
			sleep(50000);//�ж�50��
		}catch(InterruptedException e){
			System.out.println("thread interrupt");//��ִ���жϷ������̲߳����ж��쳣��
		}
	}

	public static void main(String[] args) throws  Exception {
		ThreadInterrupt th=new ThreadInterrupt();//�½��߳�
		th.start();//�����̣߳�ִ��run����
		System.out.println("50s������������жϽ���");
		System.in.read();//������̲���
		th.interrupt();//�жϽ���
		th.join();//join������waits for this thread to die ʹ���������߳���ȫִ�������ִ������Ĳ�����
		//�������join��������ô�ڳ���ִ�к󣬾ͻ��������Ļ��������ǵȵ��߳̽���������
		System.out.println("�߳��Ѿ��˳�");
		

	}

}