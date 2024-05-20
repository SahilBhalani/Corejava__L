package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserserviceImpl implements UserService {

	@Autowired
	UserRepo repo;
	
	@Override
	public void AddorUpdateUSer(User u) {
		
		repo.save(u);

	}

	@Override
	public ArrayList<User> viewalluser() {
		// TODO Auto-generated method stub
		return (ArrayList<User>) repo.findAll();
	}

	@Override
	public void deleteuser(int id) {
		repo.deleteById(id);

	}

	@Override
	public User UserbyId(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow();
	}

}
