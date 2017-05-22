package com.lily.testing;

public class TestArray {
    //创建遍历输出数组方法
	public static void printArray(int[] array){
		for (int i=0;i<array.length;i++){
			System.out.println(array[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		//声明创建使用数组
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
		System.out.println("myList数组和为："+totle);  
		
		//查找数组中最大的值
		double max=myList[0];
		for(int i=1;i<myList.length;i++){
			if(myList[i]>max){
				max=myList[i];
			}
		}
		System.out.println("myList数组最大值为："+max);
		
		//foreach循环使用
		double[] myList2={2,3.3,4,5,2,6};
		for(double element : myList2){
			System.out.println("myList2数组遍历:"+element);
		}
		//调用printArray方法，将数组作为参数传给
		printArray(new int[]{1,3,2,3,4});
		
		//多维数组??????报错？？？？
		String[][] str=new String[2][3];
		str[0] =new String[2];
		str[1] =new String[3];
		str[0][0]=new String("good");
		str[0][1]=new String("moring");
		str[0][2]=new String("lily");
		str[1][0]=new String("good");
		str[1][1]=new String("evening");
		str[1][2]=new String("mk");
		System.out.println("str数组遍历:"+str);

	}

}
