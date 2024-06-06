package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Category;

public interface CategoryService {

	
	public void AddOrUpdateCategory(Category c);
	public List<Category> ViewAllCategory();
	public void DeleteCategory(int id);
	public Category CategoryGetById(int id); 
}
