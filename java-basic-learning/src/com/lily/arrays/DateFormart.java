package com.lily.arrays;

import java.time.LocalDateTime;
import java.util.Calendar;

public class DateFormart {

	public static void main(String[] args) {
		//��ȡ��ǰ���ꡢ�¡���
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt.getYear());
		System.out.println(dt.getMonthValue());
		System.out.println(dt);
		//��ú�����
		Calendar.getInstance().getTimeInMillis();
		//��ӡ����ĵ�ǰʱ��
		LocalDateTime yestday=dt.minusDays(1);//������
		System.out.println(yestday);
	}

}
