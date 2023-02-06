package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.H_userDAO;
import util.Common;

@Controller
public class H_userController {
	@Autowired
	H_userDAO h_user_dao;

	@RequestMapping(value = { "/", "/main.do" })
	public String main() {
		return Common.VIEW_PATH_MAIN+"main.jsp";
	}
	
	@RequestMapping("/sign_up.do")
	public String sign_up() {
		return Common.VIEW_PATH_H_USER+"join.jsp";
	}
	
	//ajex 사용 = 아이디 중복체크버튼을 눌러 넘어오는 url를 통해 들어오는 부분 
	@RequestMapping("/dbCheckId.do")
	@ResponseBody
	public String dbCheckId(String id) {
		System.out.println("파라미터로 받은 아이디 " + id);
	    int result = h_user_dao.search_confirmId(id);
		if (result == 1) {
			return "[{'param':'no'}]";
		} else {
			return "[{'param':'yes'}]";
		}
	}
}
