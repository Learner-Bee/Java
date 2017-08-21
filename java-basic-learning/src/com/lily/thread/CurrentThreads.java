package com.lily.thread;

/**
 * ��ȡ���е�ǰ�߳�
 * �ѵ㣺1.��õ�ǰ�̵߳��߳���
 * 2.����߳�������Ч���߳���
 * 3.�������飬���߳���ö�ٵ���ʽ���Ƶ��������� threadgroup.enumerate(������)
 * 4.����������߳�
 * Ϊʲôdebugʱֻ��⵽һ���߳�?
 * ��Ϊ�߳�ִ���ٶȺܿ죬debugʱ�߳��Ѿ�ִ�н���������ͳ�Ʋ���
 * @author Administrator
 *
 */
public class CurrentThreads extends Thread  {
	public void run(){
		try {
			Thread.sleep(50000);
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		CurrentThreads cth=new CurrentThreads();
		cth.setName("Thread-1");
		cth.start();
		ThreadGroup thgroup=Thread.currentThread().getThreadGroup(); //��ȡ��ǰ�߳���
		int thcount=thgroup.activeCount();//��ȡ�߳����е�������Ч���߳���
		Thread[] th=new Thread[thcount];//�����߳������ȵ�����
		thgroup.enumerate(th);//���߳����еĻ�Ծ���̸߳��Ƶ�������
		for(int i=0;i<thcount;i++){//��������߳�
			System.out.println("�̺߳�"+i+" "+th[i].getName());//th[i]ͨ�����������±�������߳�
		}

	}

}
