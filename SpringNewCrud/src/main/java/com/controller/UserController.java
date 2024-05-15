package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.model.User;
import com.service.Userservice;

@Controller
public class UserController {
	
	@Autowired
	Userservice us;
	@RequestMapping("/")
	public ModelAndView index()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("user",new User());
		model.addObject("data",us.viewAllData());
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/index")
	public ModelAndView index1()
	{
		ModelAndView model = new ModelAndView();
		model.addObject("user",new User());
		model.addObject("data",us.viewAllData());
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/reg")
	public ModelAndView register(@ModelAttribute("user") User u)
	{
		ModelAndView model = new ModelAndView();
		model.addObject("user",new User());
		model.addObject("data", us.viewAllData());
		model.addObject("msg","Regisration Succesfull!!!!!");
		model.setViewName("index");
		return model;
	}
	
	@RequestMapping("/delete")
	public RedirectView delete(@RequestParam("did")int id)
	{
		us.deleteData(id);
		return new RedirectView("index");
	}
	
	@RequestMapping("/edit")
	public ModelAndView editdata(@ModelAttribute("eid") int id)
	{
		User u = us.getById(id);
		ModelAndView model = new ModelAndView();
		model.addObject("user", u);
		model.addObject("data",us.viewAllData());
		model.setViewName("index");
		return model;
		
	}
}
