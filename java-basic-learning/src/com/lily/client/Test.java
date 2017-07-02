/**
 * 
 */
package com.lily.client;

import java.util.Iterator;
import java.util.List;

import com.lily.entity.StudentEntity;
import com.lily.impl.StudentServiceImpl_1;
import com.lily.itf.IStudentService;

/**
 * @author Lily
 *
 */
public class Test {
	
	public static void main(String[] args) {
		
     	IStudentService studentService = new StudentServiceImpl_1();
//		IStudentService studentService = new StudentServiceImpl_2();
		getInfo(studentService, "ÀîÈý");
	}
	
	public static void getInfo(IStudentService studentService, String studentName){
		
		List<StudentEntity> students = studentService.getInfoByName(studentName);
		
		for (Iterator<StudentEntity> iterator = students.iterator(); iterator.hasNext();) {
			StudentEntity studentEntity = (StudentEntity) iterator.next();
			System.out.println(studentEntity);
		}
	}
}
