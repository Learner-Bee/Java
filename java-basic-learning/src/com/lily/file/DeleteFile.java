package com.lily.file;

import java.io.File;

/**
 * �ļ�ɾ��
 * ����file.delete()ɾ���ļ���ͨ��file.getName()��ȡ�ļ���
 * 1.�����ļ�·��
 * 2.�ж��ļ��Ƿ����
 *  2.1�����ڣ������ʾ���ļ������ڡ�
 *  2.2���ڣ�ɾ���ļ�
 *   2.2.1delete����true,����ļ�ɾ���ɹ�
 *   2.2.2false���ļ�ɾ��ʧ��
 * @author Administrator
 *
 */
public class DeleteFile {

	public static void main(String[] args) {
		File f=new File("E:/Learn/Java1/test4.txt");
		if(!f.exists()){
			System.out.println("�ļ�������");
		}else{
		   try{
			  if(f.delete()){
				System.out.println(f.getName()+"ɾ���ɹ�");
			  }else{
				System.out.println("�ļ�ɾ��ʧ��");
			 }
		   }catch(Exception e){}
		}

	}

}
