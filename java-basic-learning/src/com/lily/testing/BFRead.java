package com.lily.testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 通过BufferedReader读取控制台输入的字符，直到输入"q"退出
 * @author Administrator
 *
 */
public class BFRead {

	public static void main(String[] args) throws IOException {
		char c;
		//使用System.in创建BufferedReader
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入字符,按q退出");
        //读取字符
        do{
        	 c=(char)bf.read();   
        	 System.out.println(c);
        }while(c!='q');
    	   
       
	}

}
