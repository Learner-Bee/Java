package com.lily.internet;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

/**
 * ��ȡURL��Ӧͷ��Ϣ����������ִ�б���
 * ֪ʶ�㣺�õ�Map���洢��Ӧͷ��������Map���
 * @author Administrator
 *
 */
public class GetURLHeader {

	public static void main(String[] args) throws Exception {
		URL url=new URL("http://www.baidu.com");
		URLConnection con=url.openConnection();
		//�����Ӧͷ����
		long date=con.getDate();
		System.out.println("URL��Ӧͷ�����ڣ�"+new Date(date));
		
		//�����Ӧͷ����Ϣ������Map�У��������
		Map<String, List<String>> header=con.getHeaderFields();
		 //Map header=con.getHeaderFields();
		for( String key : header.keySet()){
			System.out.print(key+"   ");
			System.out.print(header.get(key));
			System.out.println();
		}

	}

}