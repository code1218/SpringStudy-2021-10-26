package com.spring.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerTest {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index1(Model model) {
		model.addAttribute("name", "김준일");
		return "index/index";
	}
	
	@RequestMapping(value = "/index2", method = RequestMethod.GET)
	public ModelAndView index2() {
		ModelAndView mav = new ModelAndView("index/index");
		mav.addObject("name", "김준이");
		return mav;
	}
}
