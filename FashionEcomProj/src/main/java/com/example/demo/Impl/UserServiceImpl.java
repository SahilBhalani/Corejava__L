package com.example.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	
	@Override
	public void AddOrUpdateUSer(User u) {
		userRepo.save(u);

	}

	@Override
	public List<User> ViewAllUser() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void DeleteUSer(int id) {
		
		userRepo.deleteById(id);

	}

	@Override
	public User UserGetById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).orElseThrow();
	}

}
