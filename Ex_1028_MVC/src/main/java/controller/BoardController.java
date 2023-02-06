package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BoardServiceImpl;

//@ : 어노테이션 (프로그래밍 주석 ) 
//컴파일러 에게 오버라이드 메서드임을 빠르게 캐치하고 정보를 제공하기 위한 용도로 사용하거나  특수한 기능으로써 클래스가 동작하도록 하는 용도 
@Controller

public class BoardController {
	//root-context.xml 은 Controller를 제외한 모든 객체를 만든다. 
	//유일하게 컨트롤러만이 servlet-context.xml에서 만들어진다.
	BoardServiceImpl service;
	

	public BoardController(BoardServiceImpl service) {
		System.out.println("--BoardController의 생성자 호출 ");
		this.service = service;
	}
	//사용자가 요청한 url을 접수하는 requestMapping 
	//사용자가 list.do를 요청하면 해당 메서드가 실행  
	//jsp의 url 매핑형태 가 아래이다 .
	@RequestMapping("/list.do")
	public String list(Model model) {
		//Model 인터페이스는 Servlet과 Controller의 중간 매개체 역할을 한다.
		
		//service 를 통해 dao의 selectList()를 호출해보자 .
		List list = service.selectList();
		
		model.addAttribute("list",list);//request로 바인딩 처리와 같은 느낌  
		
		return "board_list"; // 결과 포워딩 (/WEB-INF/views/board_list.jsp)로 들어간다.
	}
	/*
	 * public void setService(BoardServiceImpl service) { //setter 인젝션을 사용하기 위한
	 * setter 생성 this.service = service; }
	 */
	
	
}
