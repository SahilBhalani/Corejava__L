package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.service.CategoryService;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;

@Controller
public class AdminController {

	@Autowired
	UserService userService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/dashboard")
	public String db()
	{
		return "dashboard";
	}
	
	
	@RequestMapping("/adminlogin")
	public String adminlogin()
	{
		return "adminlogin";
	}
	
	
	
	
	
	
	
	
	//*******************************User Start*******************************//
	
	@RequestMapping("/users")
	public String us(Model model)
	{
		model.addAttribute("user", new User());
		model.addAttribute("users", userService.ViewAllUser());
		return "User";
	}
	
	
	@RequestMapping("/deleteUser")
	public String Deleteuser(@RequestParam("did")int id)
	{
		userService.DeleteUSer(id);
		return "redirect:users";
	}
	
	
	
	
	
	
	//*******************************User End*******************************//
	
	
	//*******************************Category Start*******************************//
	
	
	@RequestMapping("/category")
	public String ct(Model model)
	{
		model.addAttribute("category", new Category());
		model.addAttribute("categories", categoryService.ViewAllCategory());
		return "category";
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/addCategory")
	public String addcategory(@ModelAttribute("category")Category category,Model model)
	{
		categoryService.AddOrUpdateCategory(category);
		model.addAttribute("category", new Category());
		model.addAttribute("categories", categoryService.ViewAllCategory());
		
		return "redirect:category";
	
	}
	
	@RequestMapping("/deleteCategory")
	public String Deletecategory(@RequestParam("did")int id)
	{
		categoryService.DeleteCategory(id);
		return "redirect:category";
	}
	
	@RequestMapping("/updateCategory")
	public String editcat(@RequestParam("eid")int id,Model model)
	{
		model.addAttribute("category", categoryService.CategoryGetById(id));
		model.addAttribute("categories", categoryService.ViewAllCategory());
		
		
		return "category";
	}
	
	//*******************************Category End*******************************//
	
	
	//*******************************Product Start*******************************//
	
	@RequestMapping("/adminproduct")
	public String pdct(Model model)
	{
		model.addAttribute("categories", categoryService.ViewAllCategory());
		model.addAttribute("product", new Product());
		model.addAttribute("products", productService.ViewAllProduct());
		return "adminproduct";
	}
	
	@RequestMapping(method=RequestMethod.POST,value = "/addProduct")
	public String addproduct(@ModelAttribute("product")Product p,@RequestParam("catid")int id,Model model)
	{
		Category c = categoryService.CategoryGetById(id);
		p.setCategory(c);
		productService.AddOrUpdateProduct(p);
		model.addAttribute("product", new Product());
		model.addAttribute("categories", categoryService.ViewAllCategory());
		model.addAttribute("products", productService.ViewAllProduct());
		return "adminproduct";
	
	}
	
	@RequestMapping("/deleteproduct")
	public String Deleteproduct(@RequestParam("did")int id)
	{
		productService.DeleteProduct(id);
		return "redirect:adminproduct";
	}
	
	@RequestMapping("/updateproduct")
	public String editproduct(@RequestParam("eid")int id,Model model)
	{
		
		model.addAttribute("product", productService.ProductGetById(id));
		model.addAttribute("products", productService.ViewAllProduct());
		model.addAttribute("categories", categoryService.ViewAllCategory());
		
		return "adminproduct";
	}
	
	
	
	
	//*******************************Product End*******************************//
	
	//*******************************Order Start*******************************//
	
	
	
	@RequestMapping("/order")
	public String od()
	{
		return "order";
	}
	
	
	
	//*******************************Order End*******************************//
	
	
}
