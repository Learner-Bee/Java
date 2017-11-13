package com.lily.arrays;

import java.util.Arrays;

/**
 * 利用Arrays.fill()方法填充数组
 * 1.Arrays.fill(a,3):将数组a的所有值填充为3
 * 2.Arrays.fill(a,startindex,endindex,4)：将数组从startindex到endindex改为4
 * 注意：endindex位置是不变的
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
