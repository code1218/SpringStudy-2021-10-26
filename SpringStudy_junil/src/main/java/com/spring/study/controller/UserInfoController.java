package com.spring.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserInfoController {
	
	@RequestMapping(value="/user-info-insert", method = RequestMethod.GET)
	public ModelAndView userInfoInsert() {
		ModelAndView mav = new ModelAndView("userInfoInsert");
		return mav;
	}
	
	@RequestMapping(value="/insert-data", method = RequestMethod.POST, produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String insertData(	@RequestParam("user-id")String id, 
								@RequestParam("user-password")String password, 
								@RequestParam("user-name")String name,
								@RequestParam("user-phone")String phone	) {
		System.out.println(id);
		System.out.println(password);
		System.out.println(name);
		System.out.println(phone);
		return id + ", " + password + ", " + name + ", " + phone;
	}
	
}


/**
 * 1. 클래스를 @Controller component로 만들어준다.
 * 2. 메소드 정의
 * 3. @RequestMapping 정의
 */