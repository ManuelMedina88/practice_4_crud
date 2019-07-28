package com.newtech.applicant.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class IndexController {
	
	@GetMapping("/index")
	public ModelAndView showIndex(ModelAndView model) {
		
		model.addObject("title", "My Site");
		model.addObject("greeting", "Hello from the backend");
		model.setViewName("welcome_page");
		return model;
	}
}
