package com.hwj.tok.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hwj.tok.model.Student;

@Repository
public class MyBatisDaoImpl implements MyBatisDao{
	
	@Autowired
	private SqlSession sqlsession;
	
	
	private static final String NAME_SPACE = "com.hwj.tok.mybatis.MyBatisDao";
	
	@Override
	public List<Student> findAllStudendt() {
		return sqlsession.selectList(NAME_SPACE + ".findAllStudendt");
	}

	@Override
	public Student findStudent(Integer seq) {
		return sqlsession.selectOne(NAME_SPACE + ".findStudent",seq);
	}

	@Override
	public Integer updateStudent(Student student) {
		return sqlsession.update(NAME_SPACE + ".updateStudent",student);
	}

	@Override
	public Integer deleteStudent(Integer seq) {
		return sqlsession.delete(NAME_SPACE + ".deleteStudent");
	}

	@Override
	public List<Student> dynamicStudent(String value) {
		return sqlsession.selectList(NAME_SPACE + ".dynamicStudent",value);
	}

}
