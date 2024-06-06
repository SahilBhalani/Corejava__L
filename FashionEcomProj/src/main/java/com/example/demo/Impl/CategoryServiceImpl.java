package com.example.demo.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repo.CategoryRepo;
import com.example.demo.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepo categoryRepo;
	
	@Override
	public void AddOrUpdateCategory(Category u) {
		categoryRepo.save(u);

	}

	@Override
	public List<Category> ViewAllCategory() {
		// TODO Auto-generated method stub
		return categoryRepo.findAll();
	}

	@Override
	public void DeleteCategory(int id) {
		
		categoryRepo.deleteById(id);

	}

	@Override
	public Category CategoryGetById(int id) {
		// TODO Auto-generated method stub
		return categoryRepo.findById(id).orElseThrow();
	}

}
