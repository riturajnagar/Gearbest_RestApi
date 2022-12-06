package com.gearbest.service;

import java.util.List;

import com.gearbest.exception.CategoryException;
import com.gearbest.model.Category;
import com.gearbest.model.Product;


public interface CategoryService {
	
	public Category addCategory(Category category)throws CategoryException;
	
	public Category viewCategory(int categoryId)throws CategoryException;
	
	public Category deleteCategory(int categoryId)throws CategoryException;
	
	public List<Category> allCategory()throws CategoryException;
	
	public List<Product> productByCategory(int categoryId)throws CategoryException;

}
