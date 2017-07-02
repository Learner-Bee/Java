package com.lily.entity;

/**
 * 学生实体
 * 
 * @author Lily
 *
 */
public class StudentEntity {

	private String studentNo;
	private String studentName;
	private int age;
	
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentEntity [studentNo=" + studentNo + ", studentName=" + studentName + ", age=" + age + "]";
	}
	
	
}
