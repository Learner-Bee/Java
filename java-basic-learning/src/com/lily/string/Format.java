package com.lily.string;

/**
 * �ַ�����ʽ��format()��ʹ��
 * @author Administrator
 *
 */
public class Format {

	public static void main(String[] args) {
		//���������в�����%[index$][��ʶ][��С����]ת����ʽ
		//��ȡ�ڶ�������������10����ת��������5λ����0���
		System.out.println(String.format("%2$05d",32,43));
		//��һ������������5
		System.out.println(String.format("%1$5d",32,43));
		//��������������������С�����������
		System.out.println(String.format("%1$-(5d",-32,43));
		System.out.println(String.format("%2$,d",32,3443));
		
		//f������ת��
		System.out.println(String.format("%2$f",32,3443.67));
		//�ַ�ת��%c���Ҳ����������ַ�����
		System.out.println(String.format("%c",'a'));

	}

}