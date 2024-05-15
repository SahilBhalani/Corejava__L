package com.dao;

import java.util.ArrayList;

import com.model.User;

public interface Userdao {

	public void addOrUpdateData(User u);
	public ArrayList<User> viewAllData();
	public void deleteData(int id);
	public User getById(int id);
}

