package com.lily.thread;

import java.io.IOException;

import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

/**
 * 线程终止
 * @author Administrator
 *
 */
public class ThreadInterrupt extends Thread {
	public void run(){
		try{
			sleep(50000);//中断50秒
		}catch(InterruptedException e){
			System.out.println("thread interrupt");//当执行中断方法后，线程捕获到中断异常。
		}
	}

	public static void main(String[] args) throws  Exception {
		ThreadInterrupt th=new ThreadInterrupt();//新建线程
		th.start();//启动线程，执行run方法
		System.out.println("50s内输入任意键中断进程");
		System.in.read();//读入键盘操作
		th.interrupt();//中断进程
		th.join();//join方法：waits for this thread to die 使调用它的线程完全执行完后，再执行下面的操作。
		//如果不加join方法，那么在程序执行后，就会输出下面的话，而不是等到线程结束后才输出
		System.out.println("线程已经退出");
		

	}

}
