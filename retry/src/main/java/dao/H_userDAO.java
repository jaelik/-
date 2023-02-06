package dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.H_userVO;

@Repository("h_user_dao")
public class H_userDAO {

	@Autowired
	SqlSession sqlSession;
	
	
	//회원등록 
	public int insert (H_userVO vo) {
		int res = sqlSession.insert("h.user_insert",vo);
		return res;
	}
	// 아이디 중복확인
		public int search_confirmId(String id) {
			int result = -1; // 오류 발생  
			result = sqlSession.selectOne("h.search_confirmId", id);
			// 쿼리문을 (count (*) ) 통해  result에 숫자를 연산작용이 아닌 대입식으로 들어가기 떄문에  ##현재 위의 -1에서 연산작용으로 보면안된다## 
			return result;
		}
	
}
