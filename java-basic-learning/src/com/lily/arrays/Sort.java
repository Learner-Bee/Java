package com.lily.arrays;

import java.util.Arrays;

/**
 * �������������Arrays���е�sort()�������������С��������
 * Arrays���е�binarySeacrh()��������ѯ����Ԫ�ص�index
 * @author Administrator
 *
 */
public class Sort {

	public static void main(String[] args) {
		int[] a={-3,-2,4,0,2,-5,6};
		int[] b={3,2,1,-1,4,3};
		Arrays.sort(a);//Arrays���ṩ�ķ������Ǿ�̬�ģ����Կ���ֱ��ͨ��Arrayֱ������
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//������index0��3��С����������indexΪ3��Ԫ�ز�������Χ
		Arrays.sort(b, 0, 3);
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
		//����Arrays���е�binarySearch(����������ѯ��Ԫ��)��������ѯĳ��Ԫ���������е�index��������������ź����
       System.out.print("Ԫ��2������b�е�λ��Ϊ��"+Arrays.binarySearch(b, 2));
       
       //String c="qqqe";
      // c.indexOf('e'); �÷�����String��ķ����������в�����
       
	}

}
