package com.lily.testing;

import java.util.Date;

public class DiffTest {
    //计算时间间隔毫秒
	public static void main(String[] args) {
		try{
		long start = System.currentTimeMillis();
		System.out.println(new Date());
		Thread.sleep(5*1000);
		System.out.println(new Date());
		long end = System.currentTimeMillis();
		long diff=end-start;
		System.out.println("时间间隔为："+ diff);
		}
		catch (Exception e){
			System.out.println("got a exception");
		}
		

	}

}
