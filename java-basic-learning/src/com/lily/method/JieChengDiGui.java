package com.lily.method;

/**
 * �׳˵�����һ�ַ������ݹ鷽ʽʵ�ָ������Ľ׳�
 * @author Administrator
 *
 */
public class JieChengDiGui {

	public static void main(String[] args) {
		int counter=5;
		//����5���ڵ����������Ľ׳�
		for(int i=0;i<=counter;i++){
			System.out.println(i+"�Ľ׳�Ϊ��"+diGui(i));
		}
		//����5�Ľ׳�
		System.out.println(counter+"�Ľ׳�Ϊ��"+diGui(counter));

	}
	public static int diGui(int number){
		if(number==0||number==1){
			return 1;
		}else{
			return number*diGui(number-1);
		}
	} 

}