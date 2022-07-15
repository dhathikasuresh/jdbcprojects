package com.dhathika.dao;

import com.dhathika.dto.Product;

public interface ProductDao {
	
	public void createProductDao(Product product);
	public Product retriveProductDao(int pId);
	public void updateProductDao(Product product);
	public void deleteProductDao(int pId);
	public void loadExample(int i);

}
