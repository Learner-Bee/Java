package com.lily.sequence;

/**
 * ��������
 * 1�����������һ��Ԫ��keyΪ��׼ֵ�����Ԫ��λ��j=a.length,��ǰһ��Ԫ��i=0
 * 2��Ȼ������Ԫ�ؿ�ʼ�����key�Ƚϣ�ֱ��Ԫ��С��key������λ���û�
 * 3����ʱ����ǰԪ�ؿ�ʼ�����key�Ƚϣ�֪��Ԫ�ش���key�����н���
 * 4����i!=jʱ����ѭ��
 * 5����i=j����ѭ������������ִ�и÷���������key�������ߵ�����sort(a,start,i-1);sort(a,j+1,end)
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
    //sort�����Լ�˼·
	public static void sort(int[] b, int start, int end) {
		//�ݹ������������ֹ�±�Խ��
		if(start>=end){
			return;
		}
		int i = start, j = end;
		int key = b[i];
		// ��������ǰ����ֱ��С�ڻ�׼ֵ������ֵ
		while(i!=j){
		  while (i < j && key <= b[j]) {
			j--;
		}
        swap(b,i,j);
		// ��������ǰ����ֱ�����ڻ�׼ֵ������
		while (i < j && key >= b[i]) {
			i++;
		}
		swap(b,i,j);
	}
		sort(b,start,j-1);
		sort(b,i+1,end);
		
	}
    //sort2������Tmk˼·
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
