package com.lily.testing;

import java.util.Date;

public class DiffTest {
    //����ʱ��������
	public static void main(String[] args) {
		try{
		long start = System.currentTimeMillis();
		System.out.println(new Date());
		Thread.sleep(5*1000);
		System.out.println(new Date());
		long end = System.currentTimeMillis();
		long diff=end-start;
		System.out.println("ʱ����Ϊ��"+ diff);
		}
		catch (Exception e){
			System.out.println("got a exception");
		}
		

	}

}