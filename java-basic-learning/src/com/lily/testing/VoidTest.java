package com.lily.testing;

public class VoidTest {

	public static void main(String[] args) {
		printGrade(70);

	}
	public static void printGrade(double  score){
		if(score>=50){
			System.out.println("及格");
		}
		else if(score<50){
			System.out.println("不及格");
		}
	}
	

}
