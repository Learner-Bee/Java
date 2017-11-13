package com.lily.arrays;

import java.util.Arrays;

/**
 * ����Arrays.fill()�����������
 * 1.Arrays.fill(a,3):������a������ֵ���Ϊ3
 * 2.Arrays.fill(a,startindex,endindex,4)���������startindex��endindex��Ϊ4
 * ע�⣺endindexλ���ǲ����
 * 
 * @author Administrator
 *
 */
public class ArraysFill {

	public static void main(String[] args) {
		int[] array=new int[6];
		Arrays.fill(array, 5);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Arrays.fill(array, 3, 5, 3);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}

	}

}
