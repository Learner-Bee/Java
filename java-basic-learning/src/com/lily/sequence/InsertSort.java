package com.lily.sequence;

/**��������
 * ԭ���ѵ�ǰ�������Ԫ�ز���һ���Ѿ��ź�����б���
 * ���裺
 * 1���ӵ�2��Ԫ������Ϊkey��ʼ������ǰ���Ԫ�ؽ��бȽ�
 * 2����keyС��ǰ���Ԫ��ʱ��ǰ��Ԫ�غ��ƣ���Ԫ�ز��뵽��λ��
 * 3��ѭ��ִ��2��3��
 * 
 *ע�⣺������Ԫ��Ӧ�̶�Ϊkey����Ȼ����ÿ������a[j]��ֵ����䣬ÿ�β����ֵ�Ͳ��̶���
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
