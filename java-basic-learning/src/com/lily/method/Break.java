package com.lily.method;

/**
 * break�ؼ��ֵ�ʹ��
 * ����������ĳ��Ԫ��λ�ã�1.�и�Ԫ��ʱ��������ȷ��λ��2.û�и�Ԫ��ʱҲҪ������Ӧ��ʾ
 * @author Administrator
 *
 */
public class Break {

	public static void main(String[] args) {
		int [] a={1,4,3,5,7,5,4};
		int b=2,i=0;
		boolean found=false;
		for(;i<a.length;i++){
			if(a[i]==b){
				found=true;
				break;
			}
		}
		if(found){
		    System.out.println(b+"�������е�λ��Ϊ:"+i);
		}else{
			System.out.println(b+"����������");
		}

	}

}
