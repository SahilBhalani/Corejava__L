package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {

	
	public void AddOrUpdateProduct(Product p);
	public List<Product> ViewAllProduct();
	public void DeleteProduct(int id);
	public Product ProductGetById(int id); 
}
