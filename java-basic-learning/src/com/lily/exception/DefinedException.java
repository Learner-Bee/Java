package com.lily.exception;

public class DefinedException {

	public static void main(String[] args) throws myException{
		int x=0;
		if( x==1){
			throw new myException("��������Ϊ1");
		}

	}

}

class myException extends Exception{
	public myException(String msg){
		super(msg);
	}
}
