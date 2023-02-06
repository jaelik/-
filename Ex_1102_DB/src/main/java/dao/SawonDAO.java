package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.SawonVO;

public class SawonDAO {

	SqlSession sqlSession;
	
	//sqlSession 객쳉에 정보를 주기 위해 
	//1.setter injection을 사용하기 위해 setter 메서드를 작성한다.
	//2.생성자 injection을 사용하기 위해 SawonDAO의 생성자를 작성한다 .
	
	//1 .setter 인젝션 
//	public void setSqlSession(SqlSession sqlSession) {
//		this.sqlSession = sqlSession;
//	}
	
	//2. 생성자 인젝션으로 만들기 
	public  SawonDAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	
	//사원 정보 조회
	public  List<SawonVO> selectList(){
		List<SawonVO> list = sqlSession.selectList("sawon.sawon_list");
		
		return list;
	}
	
	
}
