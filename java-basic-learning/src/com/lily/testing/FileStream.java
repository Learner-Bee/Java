package com.lily.testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStream {

	public static void main(String[] args)  {
		try{
			//����Ҫ������ļ�������
			int abyte[]={1,3,4,5,6};
			//������������󣬲�ָ���ļ�
			OutputStream os=new FileOutputStream("test.txt");
			//�������飬д��������ļ�
			for(int x=0;x<abyte.length;x++){
				os.write(abyte[x]);
			}
			//�ر���������ͷ�������йص���Դ
			os.close();
			
			//��������������ָ��������ļ�
			InputStream is=new FileInputStream("test.txt");
			//�����������ļ��пɻ�õ��ֽ���
			int count=is.available();
			//ѭ�������ļ����ݣ������
			for(int y=0;y<count;y++){
				char c=(char)is.read();
				System.out.println(c);
			}
			//�ر����������ͷ�������ص���Դ
			is.close();
		}catch(IOException e){
			System.out.println("Exception");
		}

	}

}
