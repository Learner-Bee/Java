package com.lily.testing;

public class TestArray {
    //��������������鷽��
	public static void printArray(int[] array){
		for (int i=0;i<array.length;i++){
			System.out.println(array[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		//��������ʹ������
		double[] myList=new double[5];
		myList[0]=1;
		myList[1]=2;
		myList[2]=3;
		myList[3]=2;
		myList[4]=5;
		double totle=0;
		for(int i=0; i<myList.length;i++){
			totle=totle+myList[i];
		}
		System.out.println("myList�����Ϊ��"+totle);  
		
		//��������������ֵ
		double max=myList[0];
		for(int i=1;i<myList.length;i++){
			if(myList[i]>max){
				max=myList[i];
			}
		}
		System.out.println("myList�������ֵΪ��"+max);
		
		//foreachѭ��ʹ��
		double[] myList2={2,3.3,4,5,2,6};
		for(double element : myList2){
			System.out.println("myList2�������:"+element);
		}
		//����printArray��������������Ϊ��������
		printArray(new int[]{1,3,2,3,4});
		
		//��ά����??????������������
		String[][] str=new String[2][3];
		str[0] =new String[2];
		str[1] =new String[3];
		str[0][0]=new String("good");
		str[0][1]=new String("moring");
		str[0][2]=new String("lily");
		str[1][0]=new String("good");
		str[1][1]=new String("evening");
		str[1][2]=new String("mk");
		System.out.println("str�������:"+str);

	}

}