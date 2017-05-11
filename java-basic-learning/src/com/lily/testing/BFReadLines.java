package com.lily.testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 通过readLine读取字符串
 * @author Administrator
 *
 */
public class BFReadLines {

	public static void main(String[] args) throws IOException {
		String s;
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符串，输入end退出");
		do{
			s=bf.readLine();
			System.out.println(s);
		}while(!s.equals("end"));

	}

}
