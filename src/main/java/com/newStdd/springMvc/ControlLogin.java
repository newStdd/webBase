package com.newStdd.springMvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class ControlLogin implements Controller {
	@Override  
  public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {  
     ModelAndView mv = new ModelAndView();  
     mv.addObject("message", "Hello World!");  
     mv.setViewName("login");  
     return mv;  
  } 	
}
