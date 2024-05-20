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

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@GetMapping("/")
	public List<Student> viewst()
	{
		List<Student> stud = ss.viewallst();
		return stud;
		
	}
	
	@PostMapping("/")
	public String addStudent(@RequestBody Student s)
	{
		ss.AddStudent(s);
		return "User Added Successfully!!!";
	}
	
	@DeleteMapping("/")
	public String deletest(@RequestParam("id") int id)
	{
		ss.deletest(id);
		return "Student deleted Successfully!!!!";
	}
	
	@PutMapping
	public String updatest(@RequestBody Student s)
	{
		ss.updateSt(s);
		return "student updated successfully!!!!!";
	}
	
}
