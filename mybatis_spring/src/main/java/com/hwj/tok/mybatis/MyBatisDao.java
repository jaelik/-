package com.hwj.tok.mybatis;

import java.util.List;

import com.hwj.tok.model.Student;

public interface MyBatisDao {
	public List<Student> findAllStudendt();
	
	public Student findStudent(Integer seq) ;
	
	public Integer updateStudent(Student student);
	
	public Integer deleteStudent(Integer seq);
	
	public List<Student> dynamicStudent(String id);
}
