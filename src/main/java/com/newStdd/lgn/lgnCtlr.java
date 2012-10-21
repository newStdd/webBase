package com.newStdd.lgn;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
public class lgnCtlr {
	@RequestMapping(value="/lgn",method=RequestMethod.GET)
	public String lgn(HttpServletRequest AHttpServletRequest, HttpServletResponse AHttpServletResponse) throws ServletException, IOException {
		AHttpServletRequest.getRequestDispatcher("idx.jsp").forward(AHttpServletRequest, AHttpServletResponse);
		return "lgn";
	}
}
