package com.lily.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ��ȡ��ǰʱ�䣬����ʽ��
 * @author Administrator
 *
 */
public class DateFormat {

	public static void main(String[] args) {
		Date date=new Date();
		String dateformat="yyyy-MM-dd HH��mm��ss";
		SimpleDateFormat sdf=new SimpleDateFormat(dateformat);
		System.out.println(sdf.format(date));

	}

}
