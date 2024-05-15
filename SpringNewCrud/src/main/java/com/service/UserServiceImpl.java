package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Userdao;
import com.model.User;

@Service
public class UserServiceImpl implements Userservice {

	@Autowired
	Userdao userdao;
	@Override
	public void addOrUpdateData(User u) {
		userdao.addOrUpdateData(u);

	}

	@Override
	public ArrayList<User> viewAllData() {
		// TODO Auto-generated method stub
		return userdao.viewAllData();
	}

	@Override
	public void deleteData(int id) {
		userdao.deleteData(id);

	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return userdao.getById(id);
	}

}
