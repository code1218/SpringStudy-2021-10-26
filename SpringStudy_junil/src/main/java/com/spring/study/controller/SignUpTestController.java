package com.spring.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.study.model.dao.UserDao;

@Controller
public class SignUpTestController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value = "/signUp", method = RequestMethod.GET)
	public ModelAndView signUpIndex() {
		return new ModelAndView("signUp");
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/idCheck", method = RequestMethod.POST)
	public String idCheck(@RequestParam String user_email) {
		String flag = null;
		flag = Integer.toString(userDao.idCheck(user_email));
		return flag;
	}
}




