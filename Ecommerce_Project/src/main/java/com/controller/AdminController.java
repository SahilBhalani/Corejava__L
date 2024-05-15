package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	@RequestMapping("/admin")
	public String login()
	{
		return "adminlogin";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard()
	{
		return "dashboard";
	}
	
	@RequestMapping("/user")
	public String users()
	{
		return "user";
	}
	
	@RequestMapping("/category")
	public String category()
	{
		return "category";
	}
	
	@RequestMapping("/product")
	public String product()
	{
		return "products";
	}
	
	@RequestMapping("/order")
	public String order()
	{
		return "order";
	}
	
	
	
}
