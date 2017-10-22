package com.ooad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView root() {
		ModelAndView modelAndView = new ModelAndView("register");
		return modelAndView;
    }
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView("register");
		return modelAndView;
	}
	
	@RequestMapping(value= "/login", method = RequestMethod.GET)
	public ModelAndView login() {
		// Creating login DAO object in order to persist the data in the database
		ModelAndView modelAndView = new ModelAndView("login");
		if(modelAndView.getModel().get("errorMessage") != null)
			modelAndView.getModel().put("errorMessage", null);
		return modelAndView;
	}
	
}