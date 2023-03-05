package com.dhathika.service;

import java.util.ArrayList;
import java.util.List;

import com.dhathika.dao.ProductDao;
import com.dhathika.dao.ProductDaoImpl;
import com.dhathika.dto.Product;

public class ProductSeriveImpl implements ProductService {
	ProductDao productDao;

	@Override
	public void createProductService(Product product) {
		productDao = new ProductDaoImpl();
		Product gstModifiedProduct = gstCalculator(product);
		productDao.createProductDao(gstModifiedProduct);

	}

	@Override
	public String updateProductService(Product product) {
		Product gstModifiedProduct = gstCalculator(product);
		String str = productDao.updateProductDao(product);
		return str;
	}

	@Override
	public Product selectProductByPidService(int pid) {
		productDao = new ProductDaoImpl();
		Product prd = productDao.selectProductByPidDao(pid);
		Product gstModifiedProduct = offerCalculator(prd);
		return gstModifiedProduct;
	}

	@Override
	public List<Product> selectAllAvailableProductService() {
		productDao = new ProductDaoImpl();
		List<Product> prdList = productDao.selectAllAvailableProductDao();
		List<Product> newList = new ArrayList<Product>();
		for (Product prd : prdList) {
			Product gstModifiedProduct = offerCalculator(prd);
			newList.add(gstModifiedProduct);
		}

		return newList;
	}

	@Override
	public List<Product> selectAllProductsByPriceAscendingOrderService() {
		productDao = new ProductDaoImpl();
		List<Product> prdList = productDao.selectAllProductsByPriceAscendingOrderDao();
		return prdList;
	}

	@Override
	public List<Product> selectAllProductsByPIdAscendingOrderService() {
		productDao = new ProductDaoImpl();
		List<Product> prdList = productDao.selectAllProductsByPIdAscendingOrderDao();
		return prdList;
	}

	@Override
	public void deleteProductService(int prdNo) {
		productDao = new ProductDaoImpl();
		productDao.deleteProductDao(prdNo);

	}

	public Product gstCalculator(Product product) {
		double gst = (product.getPprice()*14/100);
		double gstPrice = gst + product.getPprice();
		product.setPprice(gstPrice);
		return product;

	}
	public Product offerCalculator(Product product) {
		if (product.getPtype().equalsIgnoreCase("food") || product.getPtype().equalsIgnoreCase("electrical")
				|| product.getPtype().equalsIgnoreCase("electricals")) {
			double offerprice = (product.getPprice() * 50 / 100);
			double discountPrice = product.getPprice() - offerprice;
			product.setPprice(discountPrice);

		}
		return product;
	}
}
