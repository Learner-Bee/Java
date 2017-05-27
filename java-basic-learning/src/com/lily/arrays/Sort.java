package com.lily.arrays;

import java.util.Arrays;

/**
 * 对数组进行排序，Arrays类中的sort()方法，对数组从小到大排序
 * Arrays类中的binarySeacrh()方法，查询数组元素的index
 * @author Administrator
 *
 */
public class Sort {

	public static void main(String[] args) {
		int[] a={-3,-2,4,0,2,-5,6};
		int[] b={3,2,1,-1,4,3};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//对数组index0到3从小到大排序。且index为3的元素不在排序范围
		Arrays.sort(b, 0, 3);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]+" ");
		}
		//利用Arrays类中的binarySearch(数组名，查询的元素)方法，查询某个元素在数组中的index
       System.out.println("元素2在数组b中的位置为："+Arrays.binarySearch(b, 2));
	}

}
