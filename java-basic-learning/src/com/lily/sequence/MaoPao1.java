package com.lily.sequence;

/**冒泡排序原理：逐个比较相邻两个元素，将大的元素放在后面，每次循环得到最大的元素放在数组最后；
 * 第二次循环0到最后元素之前的元素
 * 
 * 1、将第0个元素和第1个元素进行比较，如果0位置的大，和1位置进行交换；
 * 2、将第1个元素和第2个元素比较，大的放在后面，知道将最大的放在最后面；
 * 3、循环1、2，且比较的元素位置到数组末尾排好序的数前面
 * @author Administrator
 *
 */
public class MaoPao1 {

	public static void main(String[] args) {
		
		int[] a={6,5,4,3,2,1,0};
		maoPao(a);
	
	}
    public static void maoPao(int[] a){
		
		for(int i=1;i<=a.length-1;i++){   //循环n-1次
			for(int j=0;j<a.length-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
			for(int x:a){
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		
	}

}
