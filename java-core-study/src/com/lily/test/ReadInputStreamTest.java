package com.lily.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import com.lily.util.FileOperations;
/*
 * 读入图片测试类
 */
public class ReadInputStreamTest {

	public static void main(String[] args) throws IOException {
		URL url=new URL("https://www.baidu.com/img/bd_logo1.png");
		HttpURLConnection con=(HttpURLConnection)url.openConnection();//构造连接
		InputStream ips=con.getInputStream();//通过输入流获取图片数据
		byte[] getData=FileOperations.readInputStream(ips);//将图片数据传到方法中，最后返回图片转化的二进制数组
		File file=new File("logo.png");//新建file对象存放图片，且图片名为'logo.png'
		FileOutputStream ops=new FileOutputStream(file);//新建输出流对象
		ops.write(getData);//将图片到二进制码写入新建到输出流对象file中
		ops.flush();
		ops.close();
	    System.out.println("Ok");
   
	}

}
