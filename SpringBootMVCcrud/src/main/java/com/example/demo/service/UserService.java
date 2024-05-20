package com.example.demo.service;

import java.util.ArrayList;

import com.example.demo.model.User;

public interface UserService {

	public void AddorUpdateUSer(User u);
	public ArrayList<User> viewalluser();
	public void deleteuser(int id);
	public User UserbyId(int id);
	
}
