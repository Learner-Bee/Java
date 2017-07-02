package com.lily.internet;
import java.net.*;
import java.util.Date;

/**
 * 获取远程文件的大小
 * 1、建立远程连接
 * 2、通过方法getLastModified()获取时间的long型毫秒数
 * 3、格式化时间。new Date(date)  //通过date.setTime(毫秒数)
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
		System.out.println("文件最后修改时间为："+new Date(tamp));

	}

}
