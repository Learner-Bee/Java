package com.lily.arrays;

import java.util.Arrays;

/**
 * ����ϲ�����System.arraycopy()�������������� ��
 * ������Arrays.sort(array)�������������   
 * * @author Administrator
 *
 */
public class Arraymerge_sort {

	public static void main(String[] args) {
		
		int[] a={1,5,2,3};
		int[] b={2,4,7};
		int[] c=new int[a.length+b.length];//�ϲ�������������ͱ����ԭ����������ͬ
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
	    Arrays.sort(c,0,3);
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
		//�ж������Ƿ����
		System.out.println("����a������b�Ƿ���ȣ�"+a.equals(b));
		
		
		
	}

}
