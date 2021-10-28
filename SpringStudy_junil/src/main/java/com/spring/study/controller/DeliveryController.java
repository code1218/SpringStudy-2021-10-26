package com.spring.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.study.model.CustomerModel;

@Controller
public class DeliveryController {
	
	@RequestMapping(value="/delivery", method=RequestMethod.GET)
	public ModelAndView delivery() {
		return new ModelAndView("delivery");
	}
	
	@RequestMapping(value="/delivery-request", method = RequestMethod.POST)
	public ModelAndView deliveryRequest(CustomerModel customerModel) {
		ModelAndView mav = new ModelAndView("deliveryInfo");
		mav.addObject("customerModel", customerModel);
		return mav;
	}
	
	@RequestMapping(value="/delivery-request2", method = RequestMethod.POST)
	public String deliveryRequest(Model model, CustomerModel customerModel) {
		model.addAttribute("customerModel", customerModel);
		return "deliveryInfo";
	}
}
