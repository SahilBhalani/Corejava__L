package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/cart")
	public String cart()
	{
		return "cart";
	}
	
	@RequestMapping("/shop")
	public String shop()
	{
		return "shop";
	}
	
	@RequestMapping("/details")
	public String details()
	{
		return "details";
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/reg")
	public String reg()
	{
		return "reg";
	}
}
