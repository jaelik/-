package com.hwj.pms.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hwj.pms.mybatis.MyBatis_MemberService;
import com.hwj.pms.vo.MemberVO;

@Controller
public class MemberController {
	//로거 등록 	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MyBatis_MemberService myBatis_MemberService;
	
	@RequestMapping(value = "/member.do",method = RequestMethod.GET)
	public ModelAndView member() {
		return new ModelAndView("member/join","member",new MemberVO());
	}
	@RequestMapping(value = "/add/member.do",method = RequestMethod.POST)
	public String addMember(@ModelAttribute MemberVO memberVO,Model model) {
		model.addAttribute("memberVO",memberVO);
		myBatis_MemberService.insertMember(memberVO);
		return "member/result";
		
	}
}
