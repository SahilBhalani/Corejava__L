package com.example.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cart;
import com.example.demo.repo.CartRepo;
import com.example.demo.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	CartRepo cartRepo;
	 
	@Override
	public void addOrUpdateCart(Cart c) {
		cartRepo.save(c);
		
	}

	@Override
	public List<Cart> viewAllCart() {
		// TODO Auto-generated method stub
		return cartRepo.findAll();
	}

	@Override
	public void deleteCart(int id) {
		// TODO Auto-generated method stub
		cartRepo.deleteById(id);
	}

	@Override
	public Cart cartByid(int id) {
		// TODO Auto-generated method stub
		return cartRepo.findById(id).orElseThrow();
	}

	@Override
	public List<Cart> cartByUser(int id) {
		// TODO Auto-generated method stub
		return cartRepo.findAll();
	}

}
