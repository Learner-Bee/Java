package com.lily.file;

import java.io.File;

/**
 * �ļ�ɾ��
 * ����file.delete()ɾ���ļ���ͨ��file.getName()��ȡ�ļ���
 * @author Administrator
 *
 */
public class DeleteFile {

	public static void main(String[] args) {
		File f=new File("/Users/Lily/learn/Java/java-basic-learning/src/com/lily/file/test.txt");
		try{
			if(f.delete()){
				System.out.println(f.getName()+"ɾ���ɹ�");
			}else{
				System.out.println("�ļ�ɾ��ʧ��");
			}
		}catch(Exception e){}

	}

}
