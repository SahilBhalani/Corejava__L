package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repo.Userrepo;
import com.example.demo.model.User;

@Service
public class UserSeviceImpl implements UserService {

	@Autowired
	Userrepo repo;
	
	@Override
	public void AddUser(User u) {
		repo.save(u);

	}

	@Override
	public List<User> viewAlluser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteuser(int id) {
		repo.deleteById(id);

	}

	@Override
	public void updateuser(User u) {
		repo.save(u);
	}

}
