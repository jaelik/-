package com.korea.db;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.GogekDAO;
import dao.SawonDAO;
import vo.GogekVO;
import vo.SawonVO;

@Controller
public class SawonController {

	//jsp 실행 경로를 준비 
	public static final String VIEW_PATH="/WEB-INF/views/sawon/";
	
	
	SawonDAO sawon_dao;
	GogekDAO gogek_dao;

	public SawonController(SawonDAO sawon_dao) {
		this.sawon_dao = sawon_dao;
	}
	
	@RequestMapping(value= {"/","/list.do"})
	public String list(Model model) {
		//사원 목록 조회 
		List<SawonVO> list = sawon_dao.selectList();
		//model를 통해 list 바인딩 
		model.addAttribute("list",list);
		return VIEW_PATH + "sawon_list.jsp";
	}
	
	@RequestMapping("prev.do")
	public String prev(Model model) {
		
		List<SawonVO> list = sawon_dao.selectList();
		//model를 통해 list 바인딩 
		model.addAttribute("list",list);
		
		return VIEW_PATH + "sawon_list.jsp";
	}
	

	

}
