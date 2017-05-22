package com.lily.testing;

public class ScoreUtil {

	double average, sum, chn, eng, ma;

	/**
	 * @param chinese
	 * @param english
	 * @param math
	 */
	public ScoreUtil(double chinese, double english, double math) {
		chn = chinese;
		eng = english;
		ma = math;
	}

	public double calculateAverage() {
		sum = chn + eng + ma;
		average = sum / 3;
		return average;
	}

	/**
	 * 返回三门课程的平均分
	 * 
	 * @param chinese
	 *            语文成绩
	 * @param english
	 *            英语成绩
	 * @param math
	 *            数学成绩
	 * @return 平均分
	 */
	public double printAverage(double chinese, double english, double math) {
		sum = chinese + english + math;
		average = sum / 3;
		return average;
		// System.out.println("语数英平均分为：" + average);
	}
}
