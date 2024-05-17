package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	
	
	public void AddUser(User u);
	public List<User> viewAlluser();
	public void deleteuser(int id);
	public void updateuser(User u);

}
