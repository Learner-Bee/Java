package com.lily.testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ͨ��readLine��ȡ�ַ���
 * @author Administrator
 *
 */
public class BFReadLines {

	public static void main(String[] args) throws IOException {
		String s;
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�����ַ���������end�˳�");
		do{
			s=bf.readLine();
			System.out.println(s);
		}while(!s.equals("end"));

	}

}
