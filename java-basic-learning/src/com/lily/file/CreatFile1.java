package com.lily.file;

import java.io.File;
import java.io.IOException;

public class CreatFile1 {

	public static void main(String[] args) throws IOException {
		//1�������ļ�·��
		//2���ж��ļ��Ƿ����
		// 2.1������ڣ������ʾ��Ϣ���ļ��Ѿ����ڡ�
		// 2.2��������ڣ��ȴ���Ŀ¼���ٴ����ļ�����Ŀ¼�����ڣ�Ĭ�ϴ���Ŀ¼��
		
		File f=new File("E:/Learn/Java1/","test1.txt");
		if(f.exists()){
			System.out.println("�ļ��Ѿ�����");
		}else{
			f.getParentFile().mkdirs();//
			if(f.createNewFile()){
				System.out.println("�ļ������ɹ�");
			}
		}

	}

}