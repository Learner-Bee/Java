package com.lily.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.lily.util.FileOperations;

/**
 * 测试类
 * 
 * @author Lily
 *
 */
public class Test {

	public static void main(String[] args) throws IOException {
// 输出文件main方法
//		String content = Multiply.getMultiplyTable();
//		String filePath = "/Users/Lily/learn/9 multiply 9 table.txt";
//		FileOperations.storeIntoFile(content, filePath);
//		System.out.println("OK");
// 读入文件main方法 		
//		String filePath="/Users/Lily/learn/9 multiply 9 table.txt";
//		String content = FileOperations.readTxtFile(filePath);
//		System.out.print(content);
		
//下载页面图片main方法
//		URL url=new URL("http://lym25942608.lofter.com/");
//		HttpURLConnection con=(HttpURLConnection)url.openConnection(); //构造连接
//		InputStream inputStream=con.getInputStream();//通过输入流获取图片数据，再调用toByteArray()即可获取数据到byte数组
//		byte[] getData=FileOperations.readInputStream(inputStream);//获取图片到二进制数据
//		File file=new File("content.txt");
//		FileOutputStream ops=new FileOutputStream(file);
//		ops.write(getData);
//		ops.flush();
//		ops.close();
//		System.out.println("Ok");
		
	
		String content = "<img src=\"http://imglf1.nosdn.127.net/img/cEpMODErOUtmemlwSlgrQkVGV1c4TEd5WGF5cTh1ZnRlSUdQUFJPWkx2allxOG9Ed1RPRHBBPT0.jpg?imageView&amp;thumbnail=1680x0&amp;quality=96&amp;stripmeta=0&amp;type=jpg\">";
		
		System.out.println(content.split("<img src=\"")[1]);
	}

	
	

}