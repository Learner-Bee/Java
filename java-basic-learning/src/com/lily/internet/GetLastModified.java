package com.lily.internet;
import java.net.*;
import java.util.Date;

/**
 * ��ȡԶ���ļ��Ĵ�С
 * 1������Զ������
 * 2��ͨ������getLastModified()��ȡʱ���long�ͺ�����
 * 3����ʽ��ʱ�䡣new Date(date)  //ͨ��date.setTime(������)
 * 
 * @author Administrator
 *
 */
public class GetLastModified {

	public static void main(String[] args) throws Exception {
		URL url=new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
		URLConnection conn=url.openConnection();
		//conn.setUseCaches(false);
		long tamp=conn.getLastModified();
		//Date date=new Date();
		//date.setTime(tamp);
		System.out.println("�ļ�����޸�ʱ��Ϊ��"+new Date(tamp));

	}

}