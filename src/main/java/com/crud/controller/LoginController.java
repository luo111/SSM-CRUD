package com.crud.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.crud.service.LoginService;


@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@ResponseBody
	@RequestMapping("/start")
	public Map<String, Object> login(HttpServletRequest request,
			@RequestParam(value = "username", required = false) String username,
			HttpServletResponse response) {
		Map<String, Object> resultMap= new HashMap(); 
		String password = (String) request.getParameter("password");
		resultMap = loginService.checkStuInfo(username, password);
		
		return resultMap;
	}
	
	
	@ResponseBody
	@RequestMapping("/changeToMAIN")
	public ModelAndView login(HttpServletRequest request, ModelAndView model) {	
		model.setViewName("stuInfo");
		return model;
	}
	
	
}
