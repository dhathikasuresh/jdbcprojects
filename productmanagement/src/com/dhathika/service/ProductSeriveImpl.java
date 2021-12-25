package com.dhathika.service;

import java.util.List;

import com.dhathika.dao.ProductDao;
import com.dhathika.dao.ProductDaoImpl;
import com.dhathika.dto.Product;

public class ProductSeriveImpl implements ProductService{
	ProductDao productDao;

	@Override
	public void createProductService(Product product) {
		productDao = new ProductDaoImpl();
		// adding GST  to the price
		double realPrice = product.getPprice();
		double gst = (realPrice * 14/100);
		double gstPrice = realPrice + gst;
		product.setPprice(gstPrice);
	    productDao.createProductDao(product);

		
	}

	@Override
	public String updateProductService(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product selectProductByPidService(int pid) {
		productDao = new ProductDaoImpl();
		Product prd = productDao.selectProductByPidDao(pid);
		if(prd.getPtype().equalsIgnoreCase("food") || prd.getPtype().equalsIgnoreCase("electrical")
				|| prd.getPtype().equalsIgnoreCase("electricals")) {
			double offerprice =( prd.getPprice() * 50/100);
			double discountPrice = prd.getPprice()-offerprice;
			prd.setPprice(discountPrice);
		}
		return prd;
	}

	@Override
	public List<Product> selectAllAvailableProductService() {
		productDao = new ProductDaoImpl();
	List<Product> prdList =	productDao.selectAllAvailableProductDao();
	for(Product prd : prdList) {
		if(prd.getPtype().equalsIgnoreCase("food") || prd.getPtype().equalsIgnoreCase("electrical")
				|| prd.getPtype().equalsIgnoreCase("electricals")) {
			double offerprice =( prd.getPprice() * 50/100);
			double discountPrice = prd.getPprice()-offerprice;
			prd.setPprice(discountPrice);
		}
	}
		return prdList;
	}

	@Override
	public List<Product> selectAllProductsByPriceAscendingOrderService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> selectAllProductsByPriceDescendingOrderService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProductService() {
		// TODO Auto-generated method stub
		
	}

}
