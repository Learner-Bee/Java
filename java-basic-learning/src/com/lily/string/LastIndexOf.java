	package com.lily.string;

/**
 * ͨ��lastIndexOf�����������ַ��������ֵ�λ��
 * �ҵ�lastIndexOf����Ϊ-1ʱ�����û���ҵ��ַ���
 * @author Administrator
 *
 */
public class LastIndexOf {

	public static void main(String[] args) {
		String str="hi my name is lily.her name is lucy";
		String str1="my";
		int lastindex=str.lastIndexOf(str1);
		if(lastindex==-1){
			System.out.println("�ַ���str��û���ҵ�"+str1);
		}else{
		System.out.println(str1+"���ַ����е�λ��Ϊ��"+lastindex);
		}

	}

}
