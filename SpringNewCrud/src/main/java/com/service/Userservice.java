package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.model.User;

public interface Userservice {

	public void addOrUpdateData(User u);
	public ArrayList<User> viewAllData();
	public void deleteData(int id);
	public User getById(int id);
}

