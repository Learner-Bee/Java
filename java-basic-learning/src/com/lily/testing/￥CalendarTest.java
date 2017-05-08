package com.lily.testing;

import java.util.Calendar;

public class ￥CalendarTest {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		//System.out.println("当前时间： " +c);
		
		Calendar c1=Calendar.getInstance();
		c1.set(2017, 5,9);
		//System.err.println("设置的日期为： "+ c1);
		
		//Calendar类对象信息获取
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int date=c.get(Calendar.DATE);
		int hour=c.get(Calendar.HOUR_OF_DAY);
		int minute=c.get(Calendar.MINUTE);
		int second=c.get(Calendar.SECOND);
		int day=c.get(Calendar.DAY_OF_WEEK);
		System.out.println("通过Calendar类对象获取的当前日期为："+year+" "+month+" "+date+" "+hour+" "+minute+" "+second+" "+day);
		//此处的day，1代表星期日，2代表星期一，以此类推

	}

}
