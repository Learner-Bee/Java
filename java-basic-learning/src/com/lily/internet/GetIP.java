package com.lily.internet;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 获取指定主机的IP地址
 * @author Lily
 *
 */
public class GetIP {

	public static void main(String[] args) {
		InetAddress address=null;
		InetAddress address2=null;
		InetAddress localaddress=null;
		try{
			 address=InetAddress.getByName("www.baidu.com");//try语句中的变量为局部变量
			 address2=InetAddress.getByName("111.13.100.92");
			 localaddress=InetAddress.getLocalHost();//获取本机地址
		}catch(UnknownHostException e){
			System.exit(1);
		}
		System.out.println("主机名="+address.getHostName()+"\t"+" IP="+address.getHostAddress());
		System.out.println("主机名="+address2.getHostName()+"\t"+" IP="+address2.getHostAddress());
		System.out.println("主机名="+localaddress.getHostName()+"\t"+" IP="+localaddress.getHostAddress());//获取的本机名和本机ip地址

        System.exit(0);
	}

}
