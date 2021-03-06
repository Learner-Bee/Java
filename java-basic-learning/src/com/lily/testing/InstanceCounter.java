package com.lily.testing;

/**
 * 统计实例数量
 * @author Administrator
 *
 */

public class InstanceCounter {
	//声明静态变量numstance
    private static int numstance=0;
    //创建静态方法
    /**protected static int getCount(){
    	return numstance;
    }
    **/
    //创建静态方法
    private static void addInstance(){
    	numstance++;
    }
    //创建一个default类型的构造函数
    InstanceCounter() {
		InstanceCounter.addInstance();
	}
	public static void main(String[] args) {
		System.out.println("Starting With "+numstance+" stances");
		//循环创建新对象，并执行构造函数中的方法
		for(int i=0;i<500;i++){
			new InstanceCounter();
		}
		//numstance为该类的静态变量，在类中可以直接引用.也可以通过InstanceCounter.numstance引用
		System.out.println("Created "+numstance+" stances");
	}

}
