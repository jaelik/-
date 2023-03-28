package com.hwj.pms.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hwj.pms.vo.MemberVO;

@Repository
public class MyBatis_MemberDaoImpl implements MyBatis_MemberDao{
	
	@Autowired
	private SqlSession sqlsession;
	
	
	private static final String NAME_SPACE = "com.hwj.pms.mybatis.MyBatis_MemberDao";
	
	/*
	 * @Override public List<MemberVO> findAllStudendt() { return
	 * sqlsession.selectList(NAME_SPACE + ".findAllStudendt"); }
	 * 
	 * @Override public MemberVO findMember(Integer seq) { return
	 * sqlsession.selectOne(NAME_SPACE + ".findMember",seq); }
	 * 
	 * @Override public Integer updateStudent(MemberVO membervo) { return
	 * sqlsession.update(NAME_SPACE + ".updateStudent",membervo); }
	 * 
	 * @Override public Integer deleteStudent(Integer seq) { return
	 * sqlsession.delete(NAME_SPACE + ".deleteStudent"); }
	 * 
	 * @Override public List<MemberVO> dynamicStudent(String value) { return
	 * sqlsession.selectList(NAME_SPACE + ".dynamicStudent",value); }
	 */

	@Override
	public Integer memberJoin(MemberVO memberVO)throws Exception {
		return sqlsession.insert(NAME_SPACE + ".memberJoin",memberVO);
	}

	@Override
	public int idCheck(String memberId) throws Exception {
		int result = sqlsession.selectOne(NAME_SPACE + ".idCheck",memberId);
		return result;
	}

}
