package com.lily.thread;

/**
 * 线程状态监测？？？流程有点不懂
 * @author Administrator
 *
 */
public class GetState extends Thread{
	boolean waiting=false;
    boolean ready=false;
	
	public void run(){
		String thName=Thread.currentThread().getName();
		System.out.println("当前线程 "+thName+" starting");
		while(waiting){
			System.out.println("waiting= "+waiting);
			System.out.println("waiting.....");
			startWait();
		}
		try{
			Thread.sleep(10000);
		}catch(Exception e){
			System.out.println(thName+" interrupted");
		}
		System.out.println(thName+" terminating");		
		}
	synchronized void startWait(){
		try{
			while(!ready)
				wait();
		}catch(InterruptedException e){
			System.out.println("wait() interrupted");
		}
	}
	synchronized void notice(){
		ready=true;
		notify();
	}

	public static void main(String[] args) throws InterruptedException {
		GetState ge =new GetState();
		ge.setName("Thread-1");
		showThreadState(ge);//此时线程状态为New
		ge.start();
		Thread.sleep(50);
		showThreadState(ge);
		ge.waiting=true;
		Thread.sleep(50);
		showThreadState(ge);
		ge.notice();
		Thread.sleep(50);
		showThreadState(ge);
		while(ge.isAlive())
			System.out.println("alive");
		showThreadState(ge);
		

	}
	public static void showThreadState(Thread th){
		System.out.println(th.getName()+" isAlive()="+th.isAlive()+" State="+th.getState());
	}

}
