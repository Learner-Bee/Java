package com.lily.testing;
//import java.io.*;

import com.lily.util.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		//创建对象
		Employee employee=new Employee("lily");
		//调用对象成员，并传值
		employee.empAge(18);
		employee.empDisn("QA");
		employee.empSalary(10000);
		employee.printEmployee();

	}

}
