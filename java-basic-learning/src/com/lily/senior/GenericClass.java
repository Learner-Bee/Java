package com.lily.senior;

/**
 * ������
 * @author Administrator
 *
 * @param <T>
 */
public class GenericClass <T> {
	private T t;
	public void add(T t){
		this.t=t;
	}
	public T get(){
		return t;
	}

	public static void main(String[] args) {
		GenericClass<Integer> integer=new GenericClass<Integer>();
		integer.add(2);
		System.out.println(integer.get());

	}

}
