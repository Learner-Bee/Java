package com.lily.file;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 字符读取reader
 * @author Administrator
 *
 */
public class Reader {

	public static void main(String[] args) {
		try{
			BufferedReader bf=new BufferedReader(new FileReader("test.txt"));
			int a;
			String b;
			//BufferedReader.read()返回int型，在输出时，要强制转换成字符型
			//while((a=bf.read())!=-1){
			//	System.out.print((char)a);
			//}
			//System.out.println();
			while((b=bf.readLine())!=null){
				System.out.print(b);
			}
		}catch(Exception e){}

	}

}
