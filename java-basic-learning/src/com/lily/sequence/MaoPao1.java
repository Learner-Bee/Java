package com.lily.sequence;

/**ð������ԭ������Ƚ���������Ԫ�أ������Ԫ�ط��ں��棬ÿ��ѭ���õ�����Ԫ�ط����������
 * �ڶ���ѭ��0�����Ԫ��֮ǰ��Ԫ��
 * 
 * 1������0��Ԫ�غ͵�1��Ԫ�ؽ��бȽϣ����0λ�õĴ󣬺�1λ�ý��н�����
 * 2������1��Ԫ�غ͵�2��Ԫ�رȽϣ���ķ��ں��棬֪�������ķ�������棻
 * 3��ѭ��1��2���ұȽϵ�Ԫ��λ�õ�����ĩβ�ź������ǰ��
 * @author Administrator
 *
 */
public class MaoPao1 {

	public static void main(String[] args) {
		
		int[] a={6,5,4,3,2,1,0};
		maoPao(a);
	
	}
    public static void maoPao(int[] a){
		
		for(int i=1;i<=a.length-1;i++){   //ѭ��n-1��
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
