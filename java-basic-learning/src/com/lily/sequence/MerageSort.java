package com.lily.sequence;

/**
 * �鲢����
 * ԭ��:�����������������У��ϲ�Ϊһ�����С�(ʱ�临�Ӷȣ�O(nlogn))
 * ���裺
 * 1���½����ȵ��������к͵�����t
 * 2������ָ�룬�ֱ�Ϊ�������еĳ�ʼλ��
 * 3���Ƚ�����ָ����ָԪ�ش�С����С��һ�������½�����t��
 * 4����3�бȽϵ�С������ָ����ƣ���3�бȽϴ���Ǹ������Ƚϣ���С�ķ���t��
 * 5���ظ�3��4��ֱ��һ�������е�������ȫ�Ƚ��꣬��ʱ��ָ���СΪlength
 * 6��ָ���СΪlength�����б�ʾ�Ѿ�ȫ����ӵ�t�У�����һ����������Ԫ�����׷�ӵ�t��
 * @author Administrator
 *
 */
public class MerageSort {

	public static void main(String[] args) {
		int[] a={2,3,6,7,9,10},b={0,1,2,5};
		sort(a,b);
	}
	public static void sort(int[] a,int[] b){
		int[] c=new int[a.length+b.length];
		int i=0,j=0,s=0;
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				c[s]=a[i];
				i++;
				s++;
			}else{
				c[s]=b[j];
				j++;
				s++;
			}
		}
		if(i==a.length){
			for(;s<c.length;s++){
				c[s]=b[j];
				j++;
			}
		}else if(j==b.length){
			for(;s<c.length;s++){
				c[s]=a[i];
				i++;
			}
		}
		 for(int x:c){
			 System.out.print(x+" ");
		 } 
		
	}
	//public static void sort2(int[] t ,int x,int y){
	//	for(;x<t.length;x++){
	//		t[x]=
		//}
	}
	


