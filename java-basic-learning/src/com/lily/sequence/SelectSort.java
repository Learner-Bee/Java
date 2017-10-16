package com.lily.sequence;

/**
 * 选择排序
 * 原理：每次循环找到待排序元素中最小元素，顺序放在已经排好序的序列最后
 * 步骤：
 * 1、将第一个位置元素循环与第2位到最后一位的数进行比较，比第一个元素小，跟第一个位置元素调换位置
 * 2、依次循环得到最小的放在第一个位置
 * 3、循环，拿二个位置元素分别与其后面的所有元素比较，比其小，位置交换，此时前两位顺序是确定的
 * @author Administrator
 *
 */
public class SelectSort {

	public static void main(String[] args) {
		int[] a={5,2,1,5,3,0,4};
		sort(a);
	}
	public static void sort(int[] b){
		int i,j;
		for(i=0;i<b.length;i++){
			for(j=i+1;j<b.length;j++){
				if(b[j]<b[i]){
					int temp=b[j];
					b[j]=b[i];
					b[i]=temp;
				}
			}
		for(int x:b){
			System.out.print(x);
		}
		System.out.println();
		}
	}

}
