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
			throw new myException("�������Ϸ���<0");
		}else if(age >100){
			throw new myException();
		}

	}
	
	
	/**
	 * ���쳣�Ĵ���ʽ��Ҫôcatch��Ҫôthrow
	 * @param age
	 * @return
	 */
	static int test2(int age){
		try {
			test1(age);
			System.out.println("û���쳣����������");
			return age;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("�������쳣");
			return 0;
		}finally {
			System.out.println("finally");
			return 1;
		}
//		return age;
		
	}

}

//�Զ����쳣��һ��ֱ�Ӽ̳�Exception
class myException extends Exception {
	
	public myException(){
		super("�������Ϸ���>100");
	}
	
	public myException(String msg) {
		super(msg);
	}

}
