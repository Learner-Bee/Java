package com.lily.testing;
//import java.io.*;

public class EmployeeTest {

	public static void main(String[] args) {
		//��������
		Employee employee=new Employee("lily");
		//���ö����Ա������ֵ
		employee.empAge(18);
		employee.empDisn("QA");
		employee.empSalary(10000);
		employee.printEmployee();

	}

}
