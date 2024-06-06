package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {

	
	public void AddOrUpdateUSer(User u);
	public List<User> ViewAllUser();
	public void DeleteUSer(int id);
	public User UserGetById(int id); 
}
