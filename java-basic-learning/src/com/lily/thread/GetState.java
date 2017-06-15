package com.lily.thread;

/**
 * 线程状态监测？？？流程有点不懂
 * 
 * @author Administrator
 *
 */
public class GetState extends Thread {
	boolean waiting = true;
	boolean ready = false;

	public void run() {
		String thName = Thread.currentThread().getName();
		System.out.println("当前线程 " + thName + " starting");
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
		showThreadState(ge);//（一） 此时线程状态为New 
		
		ge.start();
		
		Thread.sleep(50);// （二）main线程休眠50毫秒。等待Thread-1线程执行，此时得到Thread-1线程状态是timed-waiting(计时等待).waiting=false时，不进入循环体，此时是timed-waiting
		// （三）当取消该句后，由于线程执行速度很快，所以start后，Thread-1线程刚要执行，此时main线程已经执行到下一句，此时获得的Thread-1的状态是runnable
		showThreadState(ge);
		
		//主线程等待50毫秒，此时Thread-1执行run方法。waiting=true，
		//进入第一层循环，然后进入startWait二层循环，此时一直处于wait无限期等待状态。不会再进入第一层循环
		ge.waiting=false;
		Thread.sleep(50);
		showThreadState(ge);//（四）此时因为线程处于无限期wait()，此时状态一直是waiting
		
		
		ge.notice();//调用notice方法，notify唤醒处于waiting状态下的线程。继续进行下面操作（即里层的while循环。此时ready=true，循环结束）。外层循环，此时waiting=false，所以跳出循环，执行run方法中后面的操作
		Thread.sleep(50);
	    showThreadState(ge);//此时线程属于sleep(10000)，所以此时状态为 timed-waiting
		 
		 
		 while(ge.isAlive())
		 System.out.println("alive");
		 showThreadState(ge);//因为线程处于sleep()状态，所以isAlive是true，会循环输出alive，知道时间到了，线程结束，此时状态为terminated

	}

	public static void showThreadState(Thread th) {
		System.out.println(th.getName() + " isAlive()=" + th.isAlive() + " State=" + th.getState());
	}

}
