package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcl.entity.JunitEntity;
import com.hcl.service.JunitService;

@Controller
public class JunitController {

	@Autowired
	JunitService service;

	@RequestMapping(value= {"/","/home"})
	public String mainhome() 
	{
		return "home";		
	}
	@RequestMapping("/hello")
	public String hello() 
	{
		return "hello";		
	}
	
	@RequestMapping("/hellouser")
	public String hellouser() 
	{
		return "hellouser";		
	}
	@RequestMapping("/login")
	public String login() 
	{
		return "login";		
	}
	@RequestMapping("/403")
	public String accessdenied() 
	{
		return "403";		
	}
}
