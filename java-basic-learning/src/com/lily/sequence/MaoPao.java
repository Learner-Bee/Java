package com.lily.sequence;

/**
 * 冒泡排序
 * 1、从第一个元素开始，逐个跟所有元素进行比较，大于该元素交换位置
 * 2
 * 
 * @author Administrator
 *
 */
public class MaoPao {

	public static void main(String[] args) {
		int[] a = { 3, 2, 9, 4, 3, 1, 0 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) { 
				//较少比较次数，j>i即可，因为j=i时是最大元素比较
				if (a[i] < a[j]) {
					int b = a[j];
					a[j] = a[i];
					a[i] = b;
				}

			}
			for (int x : a) {
				System.out.print(x);
			}
			System.out.println();

		}

	}

}
