package com.hwj.pms.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hwj.pms.pat.Patvo;

@Controller
public class PatController {
	private static final Logger logger = LoggerFactory.getLogger(PatController.class); 
	
	@RequestMapping(value = "/pat.do",method = RequestMethod.GET)
	public ModelAndView pat() {
		return new ModelAndView("pat/pat","pat",new Patvo());
	}
	@RequestMapping(value = "/add/pat.do",method = RequestMethod.POST)
	public String addPat(@ModelAttribute Patvo pat,Model model) {
		model.addAttribute("pat",pat);
		return "pat/result";
	}
}
