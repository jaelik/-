package com.korea.param;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vo.PersonVO;

@Controller	
public class ParamController {

	public static String PATH ="/WEB-INF/views/user/";
	
	@RequestMapping(value= {"/","/insert_form.do"}) //메인으로 지정하는 코드 
		public String insert_form() {
		return PATH + "insert_form.jsp";
	}
	
	@RequestMapping("/insert1.do")
	public String insert1(Model model,String name, int age, String tel,HttpServletRequest request) {
		//name ,age, tel 파라미터가 자동으로 넘어옵니다.
		PersonVO vo = new PersonVO();
		vo.setName(name);
		vo.setAge(age);
		vo.setTel(tel);
		
		model.addAttribute("vo",vo); //바인딩 
		return PATH + "insert_result.jsp";
	}
	@RequestMapping("/insert2.do")
	public String  insert2(Model model,PersonVO vo) {
		//파라미터로 넘어온 name , age , tel 를 vo 객체에 자동으로 셋팅을 해줍니다.
		
		//vo에도 있는데 따로 받는 파라미터에 똑같은 이름이 있다면 오류가 난다.
		model.addAttribute("vo",vo);
		return PATH + "insert_result.jsp";
	}
	
}
