package com.lily.testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStream {

	public static void main(String[] args)  {
		try{
			//定义要输出到文件的内容
			int abyte[]={1,3,4,5,6};
			//创建输出流对象，并指定文件
			OutputStream os=new FileOutputStream("test.txt");
			//遍历数组，写入输出流文件
			for(int x=0;x<abyte.length;x++){
				os.write(abyte[x]);
			}
			//关闭输出流并释放与此流有关的资源
			os.close();
			
			//定义输入流对象，指定读入的文件
			InputStream is=new FileInputStream("test.txt");
			//定义输入流文件中可获得的字节数
			int count=is.available();
			//循环读入文件内容，并输出
			for(int y=0;y<count;y++){
				char c=(char)is.read();
				System.out.println(c);
			}
			//关闭输入流，释放与其相关的资源
			is.close();
		}catch(IOException e){
			System.out.println("Exception");
		}

	}

}
