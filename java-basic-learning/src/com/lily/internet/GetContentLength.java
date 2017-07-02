package com.lily.internet;

import java.net.URL;
import java.net.URLConnection;

/**
 * 获取远程文件的大小
 * 1、建立远程连接  2、通过方法：conn.getConentLength()获取文件大小
 * @author Administrator
 *
 */
public class GetContentLength {

	public static void main(String[] args) throws Exception {
		URL url=new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
		URLConnection conn =url.openConnection();
		int size =conn.getContentLength();
		if(size<0){
			System.out.println("文件不存在");
		}else{
			System.out.println("文件大小为："+size);
		}

	}

}
