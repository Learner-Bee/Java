package com.lily.thread;

/**
 * �߳�״̬��⣿���������е㲻��
 * 
 * @author Administrator
 *
 */
public class GetState extends Thread {
	boolean waiting = true;
	boolean ready = false;

	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println("��ǰ�߳� " + thName + " starting");
		while (waiting) {
			System.out.println("waiting= " + waiting);
			System.out.println("waiting.....");
			startWait();
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(thName + " interrupted");
		}
		System.out.println(thName + " terminating");
	}

	synchronized void startWait() {
		try {
			while (!ready)
				wait();
		} catch (InterruptedException e) {
			System.out.println("wait() interrupted");
		}
	}

	synchronized void notice() {
		ready = true;
		notify();
	}

	public static void main(String[] args) throws InterruptedException {
		GetState ge = new GetState();
		ge.setName("Thread-1");
		showThreadState(ge);//��һ�� ��ʱ�߳�״̬ΪNew 
		
		ge.start();
		
		Thread.sleep(50);// ������main�߳�����50���롣�ȴ�Thread-1�߳�ִ�У���ʱ�õ�Thread-1�߳�״̬��timed-waiting(��ʱ�ȴ�).waiting=falseʱ��������ѭ���壬��ʱ��timed-waiting
		// ��������ȡ���þ�������߳�ִ���ٶȺܿ죬����start��Thread-1�̸߳�Ҫִ�У���ʱmain�߳��Ѿ�ִ�е���һ�䣬��ʱ��õ�Thread-1��״̬��runnable
		showThreadState(ge);
		
		//���̵߳ȴ�50���룬��ʱThread-1ִ��run������waiting=true��
		//�����һ��ѭ����Ȼ�����startWait����ѭ������ʱһֱ����wait�����ڵȴ�״̬�������ٽ����һ��ѭ��
		ge.waiting=false;
		Thread.sleep(50);
		showThreadState(ge);//���ģ���ʱ��Ϊ�̴߳���������wait()����ʱ״̬һֱ��waiting
		
		
		ge.notice();//����notice������notify���Ѵ���waiting״̬�µ��̡߳������������������������whileѭ������ʱready=true��ѭ�������������ѭ������ʱwaiting=false����������ѭ����ִ��run�����к���Ĳ���
		Thread.sleep(50);
	    showThreadState(ge);//��ʱ�߳�����sleep(10000)�����Դ�ʱ״̬Ϊ timed-waiting
		 
		 
		 while(ge.isAlive())
		 System.out.println("alive");
		 showThreadState(ge);//��Ϊ�̴߳���sleep()״̬������isAlive��true����ѭ�����alive��֪��ʱ�䵽�ˣ��߳̽�������ʱ״̬Ϊterminated

	}

	public static void showThreadState(Thread th) {
		System.out.println(th.getName() + " isAlive()=" + th.isAlive() + " State=" + th.getState());
	}

}
