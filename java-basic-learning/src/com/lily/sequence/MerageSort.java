package com.lily.sequence;

/**
 * �鲢����
 * ԭ��:�����������������У��ϲ�Ϊһ�����С�
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
		int[] a={2,3,6,7},b={0,1,2,5};
		sort(a,b);
	}
	public static void sort(int[] m,int[] n){
		int[] t=new int[m.length+n.length];
		int i=0,j=0,s=0;
		while(i<m.length&&j<n.length){
			if(m[i]<n[j]){
				t[s]=m[i];
				i++;
				s++;
			}else{
				t[s]=n[j];
				j++;
				s++;
			}
		}
		if(i==m.length){
			for(;s<t.length;s++){
				t[s]=n[j];
				j++;
			}
		}else if(j==n.length){
			for(;s<t.length;s++){
				t[s]=m[i];
				i++;
			}
		}
		 for(int x:t){
			 System.out.print(x+" ");
		 } 
		
	}
	//public static void print(int y,int[] s){}

}
