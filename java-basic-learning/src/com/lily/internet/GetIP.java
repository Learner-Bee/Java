package com.lily.internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ��ȡָ��������IP��ַ
 * @author Lily
 *
 */
public class GetIP {

	public static void main(String[] args) {
		InetAddress address=null;
		InetAddress address2=null;
		InetAddress localaddress=null;
		try{
			 address=InetAddress.getByName("www.baidu.com");//try����еı���Ϊ�ֲ�����
			 address2=InetAddress.getByName("111.13.100.92");
			 localaddress=InetAddress.getLocalHost();//��ȡ������ַ
		}catch(UnknownHostException e){
			System.exit(1);
		}
		System.out.println("������="+address.getHostName()+"\t"+" IP="+address.getHostAddress());
		System.out.println("������="+address2.getHostName()+"\t"+" IP="+address2.getHostAddress());
		System.out.println("������="+localaddress.getHostName()+"\t"+" IP="+localaddress.getHostAddress());//��ȡ�ı������ͱ���ip��ַ

        System.exit(0);
	}

}
