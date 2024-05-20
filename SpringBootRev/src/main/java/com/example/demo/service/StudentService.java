package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	
	public void AddStudent(Student s);
	public List<Student> viewallst();
	public void updateSt(Student s);
	public void deletest(int id);
}
