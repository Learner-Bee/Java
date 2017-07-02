package com.lily.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 获取当前时间，并格式化
 * @author Administrator
 *
 */
public class DateFormat {

	public static void main(String[] args) {
		Date date=new Date();
		String dateformat="yyyy-MM-dd HH：mm：ss";
		SimpleDateFormat sdf=new SimpleDateFormat(dateformat);
		System.out.println(sdf.format(date));

	}

}
