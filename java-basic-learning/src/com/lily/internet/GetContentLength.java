package com.lily.internet;

import java.net.URL;
import java.net.URLConnection;

/**
 * ��ȡԶ���ļ��Ĵ�С
 * 1������Զ������  2��ͨ��������conn.getConentLength()��ȡ�ļ���С
 * @author Administrator
 *
 */
public class GetContentLength {

	public static void main(String[] args) throws Exception {
		URL url=new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
		URLConnection conn =url.openConnection();
		int size =conn.getContentLength();
		if(size<0){
			System.out.println("�ļ�������");
		}else{
			System.out.println("�ļ���СΪ��"+size);
		}

	}

}
