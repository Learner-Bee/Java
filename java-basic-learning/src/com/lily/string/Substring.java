package com.lily.string;

/**
 * substring()��ȡ���ַ�����ʹ��
 * substring(int start)��ȡstartλ�õ���β���ַ���
 * substring(int begeinindex,int endindex)��ȡ������Χ���ַ�����
 * ע�⣺��ʼλ�ð��������ǽ�βλ�ò�����
 * @author Administrator
 *
 */
public class Substring {

	public static void main(String[] args) {
		String str="welcome this nice world";
		System.out.println(removeCharAt(str,3));
		System.out.println(str.substring(0, 3));
		System.out.println(str.substring(2));

	}
	//��̬����ֱ��ͨ�����������÷���ʱ�������õķ�����������Ϊ��̬����
	//�ھ�̬����A�У�ͨ��newB��������Ķ���ͨ���������B��������ʱB�������Բ��Ǿ�̬��
	public static String removeCharAt(String str,int pos){
		return str.substring(0,pos)+str.substring(pos+1);
     		
	}

}