package com.lily.sequence;

/**插入排序
 * 原理：把当前待排序的元素插入一个已经排好序的列表中
 * 步骤：
 * 1、从第2个元素命名为key开始，与其前面的元素进行比较
 * 2、当key小于前面的元素时，前面元素后移，该元素插入到该位置
 * 3、循环执行2、3，
 * 
 *注意：待插入元素应固定为key，不然随着每次排序a[j]的值都会变，每次插入的值就不固定了
 * @author Administrator
 *
 */
public class InsertSort {
	public static void main(String[] args){
		int[] a={3, 2, 9, 4, 3, 1, 0 };
		int key;
		for(int j=1;j < a.length;j++){
			key=a[j];
			for(int i=j-1;i>=0;i--){
				if(key<a[i]){
					a[i+1]=a[i];
					a[i]=key;
				}
			}
			for(int x:a){
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}
	

}
