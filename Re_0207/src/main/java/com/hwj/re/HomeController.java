package com.hwj.re;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	//톰캣 더블클릭후 module > 프로젝트 > Edit 클릭시 톰캣에서  기본적으로 패스를 지정해놔서 
	//웹에서 요청되는 포트 코드 뒤에  / 지정된 이름 /이후 요청되는 url로  지정되게끔 설정되어있다 
	//마음에 안들시 Edit에사 /뒤 이름을  지워도 된다 
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/getKnV.do", method = RequestMethod.GET)
	public String getKnV (Locale locale, Model model,@RequestParam("id") String id) {
												//RequestParam미터로 받는 ("id") 값을 String id로 받아라는 의미 
		logger.info("id >>> {}.", id);
		
		String value = "model.addAtribute()에 벨류값입니다 ";
		
		model.addAttribute("getkey", id );
		
		return "gethome";
	}
	
	
	
	@RequestMapping(value = "/gettype.do", method = RequestMethod.GET)
	//method = RequestMethod.GET 의 
	//GET방식이란  - url의 주소뒤에 ?id=exam1 이렇게  넘겨주는 '쿼리스트링' 방식 
	//POST방식이란 -  HTTP요청에 바디 부분에 내용을 넣어서 넘겨주는 방식 
	public String gettype (Locale locale, Model model) {
		
		return "gettype";
	}
	
	@RequestMapping(value = "/postKnV.do", method = RequestMethod.POST)
	public String postKnV (Locale locale, Model model,@RequestParam("id") String id) {
												//RequestParam미터로 받는 ("id") 값을 String id로 받아라는 의미 
		logger.info("id >>> {}.", id);
		
		String value = "model.addAtribute()에 벨류값입니다 ";
		
		model.addAttribute("postkey", id );
		
		return "posthome";
	}
	
	@RequestMapping(value = "/posttype.do", method = RequestMethod.GET)
	//method = RequestMethod.GET 의 
	//GET방식이란  - url의 주소뒤에 ?id=exam1 이렇게  넘겨주는 '쿼리스트링' 방식 
	//POST방식이란 -  HTTP요청에 바디 부분에 내용을 넣어서 넘겨주는 방식 
	public String posttype (Locale locale, Model model) {
		
		return "posttype";
	}
	
}
