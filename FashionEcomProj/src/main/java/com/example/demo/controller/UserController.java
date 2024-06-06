package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.User;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;



@Controller
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	CategoryService cservice;
	@Autowired
	ProductService pservice;
	
	@RequestMapping("/")
	public String start()
	{
		
		return "redirect:index";
	}
	
	@RequestMapping("/index")
	public String index(Model model)
	{
		model.addAttribute("categories", cservice.ViewAllCategory());
		
		return "index";
	}
	
	@RequestMapping("/home-02")
	public String h2()
	{
		return "home-02";
	}
	
	@RequestMapping("/home-03")
	public String h3()
	{
		return "home-03";
	}
	
	@RequestMapping("/blog")
	public String blog()
	{
		return "blog";
	}
	
	@RequestMapping("/about")
	public String abt()
	{
		return "about";
	}
	
	@RequestMapping("/contact")
	public String cnt()
	{
		return "contact";
	}
	
	@RequestMapping("/blog-detail")
	public String blogdetails()
	{
		return "blog-detail";
	}
	
	@RequestMapping("/product")
	public String pd(Model model)
	{
		model.addAttribute("categories", cservice.ViewAllCategory());
		return "product";
	}
	
	@RequestMapping("/product-detail")
	public String pdeta()
	{
		return "product-detail";
	}
	
	@RequestMapping("/shoping-cart")
	public String sc()
	{
		return "shoping-cart";
	}
	
	@RequestMapping("/reg")
	public String reg(@ModelAttribute("user")User u)
	{
		return "reg";
	}
	
	@RequestMapping("/login")
	public String login(@ModelAttribute("user")User u)
	{
		return "login";
	}
	

	
	
	
	
	@RequestMapping(value=("/userreg"),method= RequestMethod.POST)
	public String addUSer(@ModelAttribute("user")User u,Model model)
	{
		userService.AddOrUpdateUSer(u);
		model.addAttribute("msg", "Registration succesfully!!!!!");
		model.addAttribute("user", new User());
		return "reg";
	}
}
