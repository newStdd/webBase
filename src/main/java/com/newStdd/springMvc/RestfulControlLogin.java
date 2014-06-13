package com.newStdd.springMvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class RestfulControlLogin {
	@RequestMapping(value="/springMvc/restfulLogin",method=RequestMethod.GET)
	public ModelAndView login(HttpServletRequest AHttpServletRequest, HttpServletResponse AHttpServletResponse) throws ServletException, IOException {
//		AHttpServletRequest.getRequestDispatcher("login.jsp").forward(AHttpServletRequest, AHttpServletResponse);
    ModelAndView mv = new ModelAndView();  
    mv.addObject("message", "Hello World!");  
    mv.setViewName("login");  
    return mv;  
		
	}
}
