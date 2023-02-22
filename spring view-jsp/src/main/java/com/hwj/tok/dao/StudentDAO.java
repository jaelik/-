package com.hwj.tok.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.hwj.tok.mapper.StudentMapper;
import com.hwj.tok.model.Student;
//dao 사용시 사용되는 어노테이션  Component ,Repository
@Component
public class StudentDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void SetDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	//학생 등록 메서드 
	public void create(Student student) {
		String sql = "INSERT INTO Student(id, name, age) values(?,?,?)";
		jdbcTemplate.update(sql,student.getId(),student.getName(),student.getAge());
	}
	
	
	//학생 조회 메서드 -리스트 
	public List<Student>  select( ) {
		String sql = "SELECT * FROM Student";
		List<Student> students = jdbcTemplate.query(sql, new StudentMapper());
		System.out.println("student>>dao>>"+students);
		return students;
	}
	//학생 조회 메서드 -단건  
	public Student select(Integer seq ) {
		String sql = "SELECT * FROM Student WHERE seq = ?";
		Student students = jdbcTemplate.queryForObject(sql,new Object[] {seq},new StudentMapper());
		return students;
	}
	
	//학생 수정 메서드 
	
	public void update (Student student) {
		String sql = "INSERT INTO Student_Bad(id, name, age) values(?,?,?)";
		jdbcTemplate.update(sql,student.getId(),student.getName(),student.getAge());
	}
	
	//학생 삭제 메서드 
	public void delte () {
		
	}
	//학생 입력후 에러가 발생하는 학생 수정을 호출 하는 상황 
	@Transactional
	//update 문에  없는 테이블이 있는 상황이였고 어노테이션 @Transactional을 걸게되면  하나의 작업단위로 인지
	// update 문이 실행이 안되었을시 모든 작업을 실행을 안하게되어 create 문도 실행이 안되 db에 저장이 안되게된다.
	public void sampleTransaction(Student student) {
		this.create(student);
		this.update(student);
	}
}
