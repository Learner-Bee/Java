package com.lily.testing;

public class ScoreUtilTest {

	public static void main(String[] args) {
		
		ScoreUtil sc = new ScoreUtil(100, 85, 90);
		double aver = sc.calculateAverage();
		System.out.printf(String.format("%.2f", aver));
		
	}

}
