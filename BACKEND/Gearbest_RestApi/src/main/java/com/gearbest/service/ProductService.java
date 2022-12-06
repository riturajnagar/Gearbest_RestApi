package com.gearbest.service;

import java.util.List;

import com.gearbest.exception.CategoryException;
import com.gearbest.exception.ProductException;
import com.gearbest.model.Product;

public interface ProductService {
	
	public Product addProduct(Product product, int categoryId)throws ProductException,CategoryException;
	
	public Product viewProduct(int productId)throws ProductException;
	
	public List<Product> allProduct()throws ProductException;
	
	public Product removeProduct(int productId)throws ProductException;
	
	public Product updateProduct(Product product)throws ProductException;
	
	public List<Product> productByName(String name)throws ProductException;
	
}
