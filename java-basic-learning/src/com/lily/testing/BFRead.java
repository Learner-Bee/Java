package com.lily.testing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ͨ��BufferedReader��ȡ����̨������ַ���ֱ������"q"�˳�
 * @author Administrator
 *
 */
public class BFRead {

	public static void main(String[] args) throws IOException {
		char c;
		//ʹ��System.in����BufferedReader
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("�������ַ�,��q�˳�");
        //��ȡ�ַ�
        do{
        	 c=(char)bf.read();   
        	 System.out.println(c);
        }while(c!='q');
    	   
       
	}

}
