package com.korea.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import util.MyPath;

@Controller
public class TestController {
	
	//앞으로 현재 컨트롤러가 실행할 jsp의 경로를 지정 
	public static final String VIEW_PATH="/WEB-INF/views/test/";

	public TestController() {
		System.out.println("---테스트 Controller 생성자 호출 --");
	}
	
	//Model 인터페이스는 서블릿과 컨트롤러의 중간 매개체 역할을 합니다.
	@RequestMapping("/test.do")
	public String test(Model model,HttpServletRequest request ) {
		String [] msg = {"사과","바나나","복숭아","수박","딸기"};
		String ip = request.getRemoteAddr();//사용자의 ip를 받아온다.
		
		model.addAttribute("msg",msg);
		model.addAttribute("ip", ip);
		//위의 경로 지정을 통해 아래  경로를  담은 변수 + jsp 파일 이름을 더해준다.
		return MyPath.TestClass.VIEW_PATH + "test.jsp";  //test.jsp 에 포워딩 개념 위에  선 어노테이션@RequestMapping("/test.do") 해야한다
	}
	
}
