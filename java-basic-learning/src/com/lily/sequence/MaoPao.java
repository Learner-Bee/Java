package com.lily.sequence;

/**
 * 冒泡排序
 * 步骤：
 * 1、从第一个位置开始，将其前面的元素逐个与该位置元素比较，当大于该位置元素进行位置交换
 * 2、每一轮循环得到第i个位置前的所有元素是有序的
 * 3、循环1、2直到比较的位置为最后一位，则所有元素排序成功
 * 注：当出现交换顺序后，此时的a[i]就会更改
 * 
 * @author Administrator
 *
 */
public class MaoPao {

	public static void main(String[] args) {
		int[] a = { 3, 2, 9, 4, 3, 1, 0 };
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) { 
				if (a[i] < a[j]) {
					int b = a[j];
					a[j] = a[i];
					a[i] = b;
				}
			}
			for (int x : a) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		

	}

}
