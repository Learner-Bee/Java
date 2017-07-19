package com.lily.exception;

/**
 * @author Lily
 *
 */
public class DefinedException {

	public static void main(String[] args) {
		
		System.out.println(test2(111));
	}
	
	static void test1(int age) throws myException{
		if (age < 0) {
			throw new myException("参数不合法，<0");
		}else if(age >100){
			throw new myException();
		}

	}
	
	
	/**
	 * 对异常的处理方式，要么catch、要么throw
	 * @param age
	 * @return
	 */
	static int test2(int age){
		try {
			test1(age);
			System.out.println("没有异常，正常返回");
			return age;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("发生了异常");
			return 0;
		}finally {
			System.out.println("finally");
			return 1;
		}
//		return age;
		
	}

}

//自定义异常，一般直接继承Exception
class myException extends Exception {
	
	public myException(){
		super("参数不合法，>100");
	}
	
	public myException(String msg) {
		super(msg);
	}

}
