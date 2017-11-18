package com.lily.arrays;

import java.util.Arrays;

/**
 * 将一个无序数组，奇数放在数组左面，偶数放在右面，且奇偶分别排序
 * 
 * @author Lily
 *
 */
public class Ji_OuArray {

	public static void main(String[] args) {
		int[] a = { 2, 7, 4, 3, 1, 6, 5 };
		sortArray(a);

	}

	public static void sortArray(int[] a) {
		int[] b = new int[a.length];
		int m = 0, n = b.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				b[n] = a[i];
				n--;
			} else {
				b[m] = a[i];
				m++;
			}
		}
		Arrays.sort(b, 0, m);//最后循环结果m总是大于m=n+1
		Arrays.sort(b, n + 1, b.length);
		for (int x : b) {
			System.out.print(x + " ");
		}

	}

}
