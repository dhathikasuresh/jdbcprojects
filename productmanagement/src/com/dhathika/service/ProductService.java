package com.dhathika.service;

import java.util.List;

import com.dhathika.dto.Product;

public interface ProductService {
	public void createProductService(Product product);
	public String updateProductService(Product product);
	public Product selectProductByPidService(int pid);
	public List<Product>  selectAllAvailableProductService();
	public List<Product> selectAllProductsByPriceAscendingOrderService();
	public List<Product> selectAllProductsByPIdAscendingOrderService();
	public void deleteProductService(int prdNo);
}
