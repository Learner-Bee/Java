package com.lily.testing;
/**
 * 方法的重载。方法名相同，参数列表不同
 * @author Administrator
 *
 */
public class OverLoading {
    
	public int test(){
		System.out.println("test()");
		return 1;
	}
	public int test(int a){
		System.out.println("test(int a)");
		return 2;
	}
	public void test(int a,String s){
		System.out.println("test(int a ,String s)");
	}
	public void test(String s,int a){
		System.out.println("test(String s,int a)");
	}
	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		o.test();
		o.test(1);
		o.test(1, "test");
		o.test("test", 1);

	}

}
