package com.example.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;
	
	@Override
	public void AddOrUpdateProduct(Product p) {
		productRepo.save(p);

	}

	@Override
	public List<Product> ViewAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public void DeleteProduct(int id) {
		
		productRepo.deleteById(id);

	}

	@Override
	public Product ProductGetById(int id) {
		// TODO Auto-generated method stub
		return productRepo.findById(id).orElseThrow();
	}

}
