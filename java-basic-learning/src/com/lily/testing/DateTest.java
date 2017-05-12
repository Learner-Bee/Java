package com.lily.testing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��ȡ��ǰ����
		Date date=new Date();
		System.out.println(date.toString());
        
		//SimlpeDateFormat���ڸ�ʽ��
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY:MM:dd 'at' HH:mm:ss");
		System.err.println("��ǰ���ڣ�"+sdf.format(date));
		
		//printf��ʽ������
		System.out.printf("ȫ��������Ϣ��%tc%n",date);
		System.out.printf("��-��-�ո�ʽ: %tF%n" ,date);
		System.out.printf("��/��/���ʽ��%tD%n",date);
		System.out.printf("12ʱ�ƣ�%tr%n",date);
		System.out.printf("24Сʱ�ƣ�%tT%n",date);
		System.out.printf("ʱ��: %tR%n",date);
		
		//����������ʽ������
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date );
		System.out.println("\n");
		
		//Java����
		try{
			System.out.println(new Date());
			Thread.sleep(1000*3);
			System.out.println(new Date());
		}catch (Exception e){
			System.out.println("got a exception!");
			
		}
		}
	

}