package com.hwj.pms.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hwj.pms.mybatis.MyBatis_MemberService;
import com.hwj.pms.vo.MemberVO;

@Controller
public class MemberController {
	//로거 등록 	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MyBatis_MemberService myBatis_MemberService;
	
	@RequestMapping(value = "member/join.do",method = RequestMethod.GET)
	public ModelAndView member() {
		logger.info("회원 가입 페이지 진입");
		return new ModelAndView("member/join","member",new MemberVO());
	}
	@RequestMapping(value = "member/joinc.do",method = RequestMethod.POST)
	public String addMember(MemberVO memberVO) throws Exception {
		myBatis_MemberService.memberJoin(memberVO);
		logger.info("가입완료");
		return "redirect:/";
		
	}
	//로그인 페이지 이동
		@RequestMapping(value = "member/login.do", method = RequestMethod.GET)
		public String loginGET() {
			logger.info("로그인 페이지 진입");
			return"member/login";
		}
		// 아이디 중복 검사
		@RequestMapping(value = "member/memberIdChk", method = RequestMethod.POST)
		@ResponseBody
		public String memberIdChkPOST(String memberId) throws Exception{
			
			logger.info("memberIdChk() 진입");
			
			int result = myBatis_MemberService.idCheck(memberId);
			
			logger.info("결과값 = " + result);
			
			if(result != 0) {
				
				return "fail";	// 중복 아이디가 존재
				
			} else {
				
				return "success";	// 중복 아이디 x
				
			}	
			
		} // memberIdChkPOST() 종료			
	
}
