package com.lily.testing;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		//System.out.println("��ǰʱ�䣺 " +c);
		
		Calendar c1=Calendar.getInstance();
		c1.set(2017, 5,9);
		//System.err.println("���õ�����Ϊ�� "+ c1);
		
		//Calendar�������Ϣ��ȡ
		int year=c.get(Calendar.YEAR);
		int month=c.get(Calendar.MONTH);
		int date=c.get(Calendar.DATE);
		int hour=c.get(Calendar.HOUR_OF_DAY);
		int minute=c.get(Calendar.MINUTE);
		int second=c.get(Calendar.SECOND);
		int day=c.get(Calendar.DAY_OF_WEEK);
		System.out.println("ͨ��Calendar������ȡ�ĵ�ǰ����Ϊ��"+year+" "+month+" "+date+" "+hour+" "+minute+" "+second+" "+day);
		//�˴���day��1���������գ�2��������һ���Դ�����

	}

}
