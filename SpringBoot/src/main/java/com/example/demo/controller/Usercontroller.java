package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.DeleteExchange;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class Usercontroller {
	
	@Autowired
	UserService us;

	@GetMapping("/")
	public List<User> index()
	{
		List<User> user = us.viewAlluser();
		
		return user;
	}
	
	@PostMapping("/")
	public String AddUser(@RequestBody User u)
	{
		us.AddUser(u);
		return "user added Successfully!!!";
	}
	
	@DeleteMapping("/")
	public String Deleteuser(@RequestParam("id") int id)
	{
		us.deleteuser(id);
		return "user deleted!!!";
	}
	
	@PutMapping("/")
	public String updateuser(@RequestBody User u)
	{
		us.updateuser(u);
		return "user updated successfully";
	}
}
