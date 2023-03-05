package com.dhathika.dao;

import java.sql.SQLException;
import java.util.List;

import com.dhathika.dto.Product;

public interface ProductDao {	
	 void createProductDao(Product product);
	 String updateProductDao(Product product);
	 Product selectProductByPidDao(int pid);
	 List<Product>  selectAllAvailableProductDao();
	 List<Product> selectAllProductsByPriceAscendingOrderDao();
	 List<Product> selectAllProductsByPIdAscendingOrderDao();
	 void deleteProductDao(int prdNo);
	 
	 
	 
}
