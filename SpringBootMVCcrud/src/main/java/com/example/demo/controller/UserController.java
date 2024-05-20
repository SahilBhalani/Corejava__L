package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String index(Model model)
	{
		model.addAttribute("user", new User());
		model.addAttribute("data", userService.viewalluser());
		return "index";
	}
	
	@RequestMapping(value = "/reg",method = RequestMethod.POST)
	public String Registration(@ModelAttribute("user") User u,Model model)
	{
		userService.AddorUpdateUSer(u);
		if(u.getId()>0)
		{
			model.addAttribute("msg", "Update succesfully!!!!!");
		}
		else
		{
		model.addAttribute("msg", "Registration succesfully!!!!!");
		}
		model.addAttribute("user", new User());
		model.addAttribute("data", userService.viewalluser());
		return "index";
	}
	
	@RequestMapping("/delete")
	public String deleteuser(@RequestParam("did") int id)
	{
		userService.deleteuser(id);
		return "redirect:/";
		
	}
	@RequestMapping("/edit")
	public String getbyID(@RequestParam("eid")int id,Model model)
	{
		model.addAttribute("user", userService.UserbyId(id));
		model.addAttribute("data", userService.viewalluser());
		return "index";
	}
}
