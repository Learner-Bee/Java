package com.lily.thread;

/**
 * 获取所有当前线程
 * 难点：1.获得当前线程的线程组
 * 2.获得线程组中有效的线程数
 * 3.创建数组，将线程组枚举的形式复制到该数组中 threadgroup.enumerate(数组名)
 * 4.最后遍历输出线程
 * ？？为什么debug时只检测到一个线程？？？？？
 * @author Administrator
 *
 */
public class CurrentThreads extends Thread  {
	//public void run(){
		//为什么run()方法不重写，也能执行输出正确的结果呢？？
	//}

	public static void main(String[] args) {
		CurrentThreads cth=new CurrentThreads();
		cth.setName("Thread-1");
		cth.start();
		ThreadGroup thgroup=Thread.currentThread().getThreadGroup(); //获取当前线程组
		int thcount=thgroup.activeCount();//获取线程组中的所有有效的线程数
		Thread[] th=new Thread[thcount];//定义线程数长度的数组
		thgroup.enumerate(th);//将线程组中的活跃的线程复制到数组中
		for(int i=0;i<thcount;i++){//遍历输出线程
			System.out.println("线程号"+i+" "+th[i].getName());//th[i]通过访问数组下标来获得线程
		}

	}

}
