package com.lily.itf;

import java.util.List;

import com.lily.entity.StudentEntity;

/**
 * 学生实体相关服务类
 * 
 * @author Lily
 *
 */
public interface IStudentService {

	/**
	 * 通过学生姓名查找学生信息，可能是多个学生实体
	 * 
	 * @param studentName
	 * @return 
	 */
	List<StudentEntity> getInfoByName(String studentName);
}
