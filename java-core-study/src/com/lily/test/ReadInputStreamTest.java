package com.lily.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import com.lily.util.FileOperations;

public class ReadInputStreamTest {

	public static void main(String[] args) throws IOException {
		URL url=new URL("https://www.baidu.com/img/bd_logo1.png");
		HttpURLConnection con=(HttpURLConnection)url.openConnection();
		InputStream ips=con.getInputStream();
		byte[] getData=FileOperations.readInputStream(ips);
		File file=new File("logo.png");
		FileOutputStream ops=new FileOutputStream(file);
		ops.write(getData);
		ops.flush();
		ops.close();
	    System.out.println("Ok");
   
	}

}
