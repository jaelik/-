package com.hwj.pms.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwj.pms.vo.MemberVO;


@Service
public class MyBatis_MemberService {
	@Autowired
	private MyBatis_MemberDao myBatis_MemberDao;
	
	
	public List<MemberVO> findAllStudent(){
		return myBatis_MemberDao.findAllStudendt();
	}
	
	public MemberVO findStudent(Integer seq) {
		return myBatis_MemberDao.findMember(seq);
	}
	
	public Integer updateStudent(MemberVO membervo) {
		return myBatis_MemberDao.updateStudent(membervo);
	}
	
	public Integer deleteStudent(Integer seq) {
		return myBatis_MemberDao.deleteStudent(seq);
	}
	
	public List<MemberVO> findStudentById(String id ){
		return myBatis_MemberDao.dynamicStudent(id);
	}
	
	public Integer insertMember(MemberVO memberVO) {
		return myBatis_MemberDao.insertMember(memberVO);
	}
}
