package com.lily.sequence;

/**��������
 * ԭ���ѵ�ǰ�������Ԫ�ز���һ���Ѿ��ź�����б���
 * ���裺1���ӵ�j=1��Ԫ�ؿ�ʼ����j-1��Ԫ�رȽ�
 * 2������С��ǰ���Ԫ��ʱ��ǰ��Ԫ�غ��ƣ���Ԫ�ز��뵽����
 * 
 *ע�⣺������Ԫ��Ӧ�̶�Ϊkey����Ȼ����ÿ������a[j]��ֵ����䣬ÿ�β����ֵ�Ͳ��̶���
 * @author Administrator
 *
 */
public class InsertSort {
	public static void main(String[] args){
		int[] a={2,1,5,2,4,9};
		int key;
		for(int j=1;j < a.length;j++){
			key=a[j];
			for(int i=j-1;i>=0;i--){
				if(key<=a[i]){
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
