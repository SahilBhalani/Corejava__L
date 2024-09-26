package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping("/")
    public String start() {
        return "hello";
    }
    
    @GetMapping("/login")
    public String login()
    {
    	System.out.println("Hello");
    	return "index";
    }
    
    @GetMapping("/admin")
    public String admin()
    {
    	return "this is admin login....";
    }
    
    @GetMapping("/admin/home")
    public String adminhome()
    {
    	return "this is admin home page";
    }
    
    @GetMapping("/user")
    public String user()
    {
    	return "this is user login";
    }

}
