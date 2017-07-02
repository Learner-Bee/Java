/**
 * 
 */
package com.lily.impl;

import java.util.ArrayList;
import java.util.List;

import com.lily.entity.StudentEntity;
import com.lily.itf.IStudentService;

/**
 * @author Lily
 *
 */
public class StudentServiceImpl_1 implements IStudentService {

	/* (non-Javadoc)
	 * @see com.lily.itf.IStudentService#getInfoByName(java.lang.String)
	 */
	@Override
	public List<StudentEntity> getInfoByName(String studentName) {
		
		System.out.println("你调用了服务实现类：StudentServiceImpl_1");
		
		List<StudentEntity> students = new ArrayList<StudentEntity>();
		
		StudentEntity s1 = new StudentEntity();
		s1.setStudentNo("101");
		s1.setStudentName("张三");
		s1.setAge(18);
		students.add(s1);
		
		StudentEntity s2 = new StudentEntity();
		s2.setStudentNo("102");
		s2.setStudentName("李四");
		s2.setAge(17);
		students.add(s2);
		
		return students;
	}

}
