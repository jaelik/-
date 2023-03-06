package com.hwj.pms.mybatis;

import java.util.List;

import com.hwj.pms.vo.MemberVO;

public interface MyBatis_MemberDao {
	public List<MemberVO> findAllStudendt();
	
	public MemberVO findMember(Integer seq) ;
	
	public Integer updateStudent(MemberVO memervo);
	
	public Integer deleteStudent(Integer seq);
	
	public List<MemberVO> dynamicStudent(String id);
	
	public Integer insertMember(MemberVO memberVO);
}
