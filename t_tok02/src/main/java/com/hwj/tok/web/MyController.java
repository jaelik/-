package com.hwj.tok.web;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hwj.tok.model.TokTok;

@Controller
public class MyController {
	//리턴 방식  아래의 여라가지가 있다 
	@RequestMapping(value = "/my/my_string",method = RequestMethod.GET)
	public String myString (Model model) {
		model.addAttribute("tok",new TokTok("my_string"));
		return "my/my_string";
	}
	
	@RequestMapping(value = "/my/my_ModelAndView",method = RequestMethod.GET)
	public ModelAndView myString() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("my/my_ModelAndView");
		mav.addObject("tok",new TokTok("my_ModelAndView"));
		return mav;
	}
	@RequestMapping(value = "/my/my_void",method = RequestMethod.GET)
	public void myVoid(Model model) {
		model.addAttribute("tok",new TokTok("my_void"));
	}
	
	@RequestMapping(value = "/my/my_toktok",method = RequestMethod.GET)
	public TokTok myTokTok() {
		return new TokTok("my_toktok");
	}
	//이 방식은  jsp 파일을 만들지 않고 바로 리턴 
	//한글은 깨지기 때문에 httpHeader, ResponseEntity<String> 사용 
	@RequestMapping(value = "/my/my_body",method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<String> myBody() {
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type","text/html; charset=UTF-8");
		
		
		String html = "<h2>korea</h2> \n <h2>코리아</h2>";
		return new ResponseEntity<String>(html,header,HttpStatus.OK);
	}
}
