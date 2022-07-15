package com.dhathika.service;

import com.dhathika.dao.ProductDao;
import com.dhathika.dao.ProductDaoImpl;
import com.dhathika.dto.Product;

public class ProductServiceImpl  implements ProductService{

	 ProductDao productDao = new ProductDaoImpl();
	@Override
	public void createProductService(Product product) {
	       
		double realPrice = product.getpPrice();
		double gst = (18/100)*realPrice;
		double newGstPrice = realPrice + gst;
		product.setpPrice(newGstPrice);
		
		productDao.createProductDao(product);
	}

	@Override
	public Product retriveProductService(int pId) {       
		return productDao.retriveProductDao(pId);
	}

	@Override
	public void updateProductService(Product product) {
	productDao.updateProductDao(product);
		
	}

	@Override
	public void deleteProductService(int pId) {
productDao.deleteProductDao(pId);
		
	}

	@Override
	public void loadMethod(int i) {
		productDao.loadExample(i);
		
	}

}
