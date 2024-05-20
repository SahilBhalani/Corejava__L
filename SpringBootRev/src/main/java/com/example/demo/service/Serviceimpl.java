package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;

@Service
public class Serviceimpl implements StudentService {

	@Autowired
	StudentRepo repo;
	
	@Override
	public void AddStudent(Student s) {
		repo.save(s);

	}

	@Override
	public List<Student> viewallst() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void updateSt(Student s) {
		repo.save(s);

	}

	@Override
	public void deletest(int id) {
		repo.deleteById(id);

	}

}
