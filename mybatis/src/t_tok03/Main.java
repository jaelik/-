package t_tok03;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Main {
	public static void main(String[] args)throws IOException {
		//select();
		selectMapper();
	}
	//자바 어노테이션을 이용한 mapper 방법 
	public static void selectMapper() throws IOException{
		Reader reader = Resources.getResourceAsReader("t_tok03/mybatis-config.xml");
		SqlSessionFactory sqlsessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlsessionFactory.openSession();
		session.getConfiguration().addMapper(StudentMapper.class);
		
		StudentMapper mapper = session.getMapper(StudentMapper.class);
		List<Student> list = mapper.selectStudent();
		
		for(Student s : list) {
			System.out.println(s);
		}
	}
	//xml을이용한  mapper 방법 
	public static void select() throws IOException {
		Reader reader = Resources.getResourceAsReader("t_tok03/mybatis-config.xml");
		SqlSessionFactory sqlsessionFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlsessionFactory.openSession();
		
		List<Student> list = session.selectList("Student.findAllStudent");
		System.out.println(list.size());
		
		for(Student s : list) {
			System.out.println(s);
		}
	}
	
}
