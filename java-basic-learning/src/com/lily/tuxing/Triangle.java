package com.lily.tuxing;

/**
 * ���ָ��������������
 * �������λ���Ϊ����ͼ��
 * @author Administrator
 *
 */
public class Triangle {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++){
			
			for(int j=n;j>i;j--){
				System.out.print(" ");
			}//��һ�������Σ�j��5��ʼѭ������j����iʱ������հ�
			
			for(int j=1;j<=i;j++){
			System.out.print("*");
			}//�ڶ���ͼ�Σ�j��1��ʼ����j<=iʱ�����*
			
			for(int j=1;j<i;j++){
				System.out.print("*");
			}//������ͼ�Σ�����һ��ͼ��һ����ֻ���෴����
			System.out.println();
		}

	}
	

}
