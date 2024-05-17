package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface Userrepo extends JpaRepository<User, Integer >{

}
