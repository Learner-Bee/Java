package com.lily.testing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//获取当前日期
		Date date=new Date();
		System.out.println(date.toString());
        
		//SimlpeDateFormat日期格式化
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY:MM:dd 'at' HH:mm:ss");
		System.err.println("当前日期："+sdf.format(date));
		
		//printf格式化日期
		System.out.printf("全部日期信息：%tc%n",date);
		System.out.printf("年-月-日格式: %tF%n" ,date);
		System.out.printf("月/日/年格式：%tD%n",date);
		System.out.printf("12时制：%tr%n",date);
		System.out.printf("24小时制：%tT%n",date);
		System.out.printf("时分: %tR%n",date);
		
		//用索引来格式化日期
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date );
		System.out.println("\n");
		
		//Java休眠
		try{
			System.out.println(new Date());
			Thread.sleep(1000*3);
			System.out.println(new Date());
		}catch (Exception e){
			System.out.println("got a exception!");
			
		}
		}
	

}
