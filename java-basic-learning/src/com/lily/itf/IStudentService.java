package com.lily.itf;

import java.util.List;

import com.lily.entity.StudentEntity;

/**
 * ѧ��ʵ����ط�����
 * 
 * @author Lily
 *
 */
public interface IStudentService {

	/**
	 * ͨ��ѧ����������ѧ����Ϣ�������Ƕ��ѧ��ʵ��
	 * 
	 * @param studentName
	 * @return 
	 */
	List<StudentEntity> getInfoByName(String studentName);
}
