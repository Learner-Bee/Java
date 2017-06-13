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
		URL url=new URL("http://www.runoob.com");
		URLConnection con=url.openConnection();
		Map<String,String> header=new HashMap(con.getHeaderFields());
		 //Map header=con.getHeaderFields();
		for( String key : header.keySet()){
			System.out.print(key+" ");
			System.out.print(header.get(key));
			System.out.println();
		}

	}

}
