package com.dhathika.service;

import com.dhathika.dto.Product;

public interface ProductService {
	
	public void createProductService(Product product);
	public Product retriveProductService(int pId);
	public void updateProductService(Product product);
	public void deleteProductService(int pId);
	public void loadMethod(int i);

}
