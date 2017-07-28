package com.lily.arrays;

import java.time.LocalDateTime;
import java.util.Calendar;

public class DateFormart {

	public static void main(String[] args) {
		//获取当前的年、月、日
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt.getYear());
		System.out.println(dt.getMonthValue());
		System.out.println(dt);
		//获得毫秒数
		Calendar.getInstance().getTimeInMillis();
		//打印昨天的当前时间
		LocalDateTime yestday=dt.minusDays(1);//件天数
		System.out.println(yestday);
	}

}
