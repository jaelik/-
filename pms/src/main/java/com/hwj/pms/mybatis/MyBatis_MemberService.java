package com.hwj.pms.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwj.pms.vo.MemberVO;


@Service
public class MyBatis_MemberService implements MyBatis_MemberDao {
	@Autowired
	private MyBatis_MemberDao myBatis_MemberDao;
	
	
	/*
	 * public List<MemberVO> findAllStudent(){ return
	 * myBatis_MemberDao.findAllStudendt(); }
	 * 
	 * public MemberVO findStudent(Integer seq) { return
	 * myBatis_MemberDao.findMember(seq); }
	 * 
	 * public Integer updateStudent(MemberVO membervo) { return
	 * myBatis_MemberDao.updateStudent(membervo); }
	 * 
	 * public Integer deleteStudent(Integer seq) { return
	 * myBatis_MemberDao.deleteStudent(seq); }
	 * 
	 * public List<MemberVO> findStudentById(String id ){ return
	 * myBatis_MemberDao.dynamicStudent(id); }
	 */
	
	public Integer memberJoin(MemberVO memberVO) throws Exception {
		 return myBatis_MemberDao.memberJoin(memberVO);
	}
	
	public int idCheck(String memberId) throws Exception {
		
		return myBatis_MemberDao.idCheck(memberId);
	}

	/*
	 * @Override public List<MemberVO> findAllStudendt() { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public MemberVO findMember(Integer seq) { // TODO Auto-generated
	 * method stub return null; }
	 * 
	 * @Override public List<MemberVO> dynamicStudent(String id) { // TODO
	 * Auto-generated method stub return null; }
	 */
}
