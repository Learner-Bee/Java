package com.lily.internet;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**抓取网页信息？？？？？乱码
 * @author Administrator
 *
 */
public class GetWebPage {

	public static void main(String[] args) throws Exception {
		//1、创建url对象，建立连接
		//2、创建输入输出流
		//3、读入网页内容，判断内容是否为空
		//  3.1不为空，将网页上的内容写入本地文件
		//  3.2如果为空关闭输入输出流
		String line;
		URL url=new URL("http://www.runoob.com");
		BufferedReader reader=new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
		BufferedWriter writer=new BufferedWriter(new FileWriter("webpage.html"));
		if(( line=reader.readLine())!=null){
			writer.write(line);
			
		}else{
			reader.close();
			writer.close();
			System.out.println("OK");
		}
	}

}
