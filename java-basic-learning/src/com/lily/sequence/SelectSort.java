package com.lily.sequence;

/**
 * ѡ������
 * ԭ��ÿ��ѭ���ҵ�������Ԫ������СԪ�أ�˳������Ѿ��ź�����������
 * ���裺
 * 1������һ��λ��Ԫ��ѭ�����2λ�����һλ�������бȽϣ��ȵ�һ��Ԫ��С������һ��λ��Ԫ�ص���λ��
 * 2������ѭ���õ���С�ķ��ڵ�һ��λ��
 * 3��ѭ�����ö���λ��Ԫ�طֱ�������������Ԫ�رȽϣ�����С��λ�ý�������ʱǰ��λ˳����ȷ����
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
