package com.newStdd.springMvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class RestfulControlLogin {
	@RequestMapping(value="/restfulLogin",method=RequestMethod.GET)
	public String login(HttpServletRequest AHttpServletRequest, HttpServletResponse AHttpServletResponse) throws ServletException, IOException {
//		AHttpServletRequest.getRequestDispatcher("login.jsp").forward(AHttpServletRequest, AHttpServletResponse);
		return "restfulLogin";
	}
}
