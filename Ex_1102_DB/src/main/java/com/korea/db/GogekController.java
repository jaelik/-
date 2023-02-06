package com.korea.db;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.GogekDAO;
import vo.GogekVO;

@Controller
public class GogekController {

	public static final String VIEW_PATH="/WEB-INF/views/gogek/";
	public static final String NEXT_PATH="/WEB-INF/views/gogek/";

	GogekDAO gogek_dao;

	public GogekController(GogekDAO gogek_dao) {
		this.gogek_dao = gogek_dao;
	}

	@RequestMapping("list2.do")

	public String list2(Model model) {
		//고객목록 조회 
		List<GogekVO> list2 = gogek_dao.selectList();
		//model 바인딩 

		model.addAttribute("list2", list2);

		return VIEW_PATH+"gogek_list.jsp";

	}
	@RequestMapping("insert.do")
	public String insert(Model model) {

		List<GogekVO> list2 = gogek_dao.selectList();
		//model 바인딩 

		model.addAttribute("list2", list2);
		
		return NEXT_PATH + "gogek_list.jsp";
	}




}
