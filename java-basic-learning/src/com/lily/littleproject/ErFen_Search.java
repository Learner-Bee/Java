package com.lily.littleproject;


/**
 * ���ֲ��ң�ǰ����������������У�����ָ����Ԫ�ص�λ��
 * ˼·��
 * 1���ҵ��������м�λ��Ԫ��
 * 2�����������Ԫ�رȽ�
 *   2.1������ڴ���Ԫ�ء���ô��ǰ�������ݼ���ѭ��ִ�����ϲ���
 *   2.2���С�ڴ���Ԫ�ء���ô����������ݼ���ִ�����ϲ���
 *   2.3������ڲ���Ԫ�أ����Ԫ�ص�λ��
 * @author Administrator
 *
 */
public class ErFen_Search {

	public static void main(String[] args) {
		int[] a={1,3,4,5,8,9};
		int b=8;
		int index=search(a,b,0,a.length);
		System.out.println(b+"�������е�λ��Ϊ��"+index);

	}
	public static int search(int[] a,int b,int start,int end){
		if(a==null||a.length<1)
			return -1;
		if(start<=end){
			 int mi=(start+end)/2;
			if(b<a[mi]){
				 return search(a,b,start,mi-1);
			}else if (b>a[mi]){
				 return search(a,b,mi+1,end);
			}else if(a[mi]==b){
				return mi;
				
			}
		}
		return -1;
	
		
		
		
	}

}
