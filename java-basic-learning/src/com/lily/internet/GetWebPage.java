package com.lily.internet;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**抓取网页信息
 * 重点：转码时容易乱码，
 * @author Administrator
 *
 */
public class GetWebPage {

	public static void main(String[] args) throws Exception {
		//1、创建url对象，建立连接
		//2、创建输入输出流
		//3、读入网页内容，
		//4、判断文件是否存在
		//  4.1如果文件存在，写入文件。判断内容是否为空
		//     4.1.1不为空，将网页上的内容写入本地文件
		//     4.1.3如果为空关闭输入输出流
		//  4.2如果文件不存在，输出提示信息
		String line;
		URL url=new URL("https://www.yongche.com");
		File file =new File("webpage.html");
		URLConnection conn=url.openConnection(); 
		BufferedReader reader=new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));//明确读取时的编码格式
		BufferedWriter writer=new BufferedWriter(new FileWriter(file));
		//InputStream in=conn.getInputStream();
		//OutputStream out=conn.getOutputStream();
		if(file.exists()){
		    while(( line=reader.readLine())!=null){
		    	//System.out.println(line);
			   writer.write(line);
			   }
			reader.close();
			writer.close();
			System.out.println("OK");
		}else{
			System.out.println("找不到文件");
		}
		
	}

}
