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

		// ��������ǰ����ֱ��С�ڻ�׼ֵ������ֵ
		while (i < j && key <= b[j]) {
			j--;
		}

		b[i] = b[j];
		b[j] = key;

		// ��������ǰ����ֱ�����ڻ�׼ֵ������
		while (i < j && key >= b[i + 1]) {
			i++;
		}
		b[j] = b[i + 1];
		b[i + 1] = key;
	}

	public static void sort2(int[] b, int start, int end) {

		// �ݹ��������
		if (start >= end) {
			return;
		}

		int i = start;
		int j = end;

		// ��׼ֵ
		int pivot = b[i];

		// �Ƚ�˳�򣬴�ǰ����ʱΪfalse���Ӻ���ǰʱΪtrue
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
