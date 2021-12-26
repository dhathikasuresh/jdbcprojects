package com.dhathika.dao;

import java.sql.SQLException;
import java.util.List;

import com.dhathika.dto.Product;

public interface ProductDao {
	
	public void createProductDao(Product product);
	public String updateProductDao(Product product);
	public Product selectProductByPidDao(int pid);
	public List<Product>  selectAllAvailableProductDao();
	public List<Product> selectAllProductsByPriceAscendingOrderDao();
	public List<Product> selectAllProductsByPIdAscendingOrderDao();
	public void deleteProductDao(int prdNo);
	

}
