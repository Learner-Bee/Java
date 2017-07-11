package com.lily.sequence;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 4, 3, 6, 2, 1, 5 };
		int m = 0, n = a.length - 1;
		// sort(a, m, n);
		sort2(a, m, n);
		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static void sort(int[] b, int start, int end) {

		int i = start, j = end;
		int key = b[0];

		// 从右向左前进，直到小于基准值，交换值
		while (i < j && key <= b[j]) {
			j--;
		}

		b[i] = b[j];
		b[j] = key;

		// 从左向右前进，直到大于基准值，交换
		while (i < j && key >= b[i + 1]) {
			i++;
		}
		b[j] = b[i + 1];
		b[i + 1] = key;
	}

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
