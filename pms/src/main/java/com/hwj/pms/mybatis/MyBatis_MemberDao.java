package com.hwj.pms.mybatis;

import java.util.List;

import com.hwj.pms.vo.MemberVO;

public interface MyBatis_MemberDao  {
	//public List<MemberVO> findAllStudendt();
	
	//public MemberVO findMember(Integer seq) ;
	
	//public Integer updateStudent(MemberVO memervo);
	
	//public Integer deleteStudent(Integer seq);
	
	//public List<MemberVO> dynamicStudent(String id);
	
	public Integer memberJoin(MemberVO memberVO)throws Exception;
	
	// 아이디 중복 검사
		public int idCheck(String memberId) throws Exception;
}
