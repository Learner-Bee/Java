package com.lily.internet;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;

/**
 * 获取URL响应头信息？？？？？执行报错
 * 知识点：用到Map来存储响应头，并遍历Map输出
 * @author Administrator
 *
 */
public class GetURLHeader {

	public static void main(String[] args) throws Exception {
		URL url=new URL("http://www.baidu.com");
		URLConnection con=url.openConnection();
		//获得响应头日期
		long date=con.getDate();
		System.out.println("URL响应头的日期："+new Date(date));
		
		//获得响应头的信息，存在Map中，遍历输出
		Map<String, List<String>> header=con.getHeaderFields();
		 //Map header=con.getHeaderFields();
		for( String key : header.keySet()){
			System.out.print(key+"   ");
			System.out.print(header.get(key));
			System.out.println();
		}

	}

}
