package com.lily.sequence;

/**
 * 快速排序
 * 1、定义数组第一个元素key为基准值，最后元素位置j=a.length,最前一个元素i=0
 * 2、然后从最后元素开始逐个与key比较，直到元素小于key，进行位置置换
 * 3、此时从最前元素开始逐个与key比较，知道元素大于key，进行交换
 * 4、当i!=j时继续循环
 * 5、当i=j结束循环，继续迭代执行该方法，排序key左右两边的数组sort(a,start,i-1);sort(a,j+1,end)
 * @author Administrator
 *
 */

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 8, 3, 9, 2, 1, 10,6,5,12,4,16 };
		int m = 0, n = a.length - 1;
		 sort(a, m, n);
		//sort2(a, m, n);
		for (int x : a) {
			System.out.print(x + " ");
		}
	}
    //sort方法自己思路
	public static void sort(int[] b, int start, int end) {
		//递归结束条件，防止下标越界
		if(start>=end){
			return;
		}
		int i = start, j = end;
		int key = b[i];
		// 从右向左前进，直到小于基准值，交换值
		while(i!=j){
		  while (i < j && key <= b[j]) {
			j--;
		}
        swap(b,i,j);
		// 从左向右前进，直到大于基准值，交换
		while (i < j && key >= b[i]) {
			i++;
		}
		swap(b,i,j);
	}
		sort(b,start,j-1);
		sort(b,i+1,end);
		
	}
    //sort2方法，Tmk思路
	public static void sort2(int[] b, int start, int end) {

		// 递归结束条件
		if (start >= end) {
			return;
		}

		int i = start;
		int j = end;

		// 基准值
		int pivot = b[i];

		// 比较顺序，从前往后时为false，从后往前时为true
		boolean order = true;

		while (i != j) {
			if (order) {
				if (pivot > b[j]) {

					swap(b, i, j);
					order = false;
				} else {
					j--;
				}
			} else {
				if (pivot < b[i]) {
					swap(b, i, j);
					order = true;
				} else {
					i++;
				}
			}
		}
		sort2(b, start, j - 1);
		sort2(b, i + 1, end);
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
