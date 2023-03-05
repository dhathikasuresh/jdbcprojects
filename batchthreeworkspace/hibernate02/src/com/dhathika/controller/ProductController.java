package com.dhathika.controller;

import java.util.Date;
import java.util.Scanner;

import com.dhathika.dto.Product;
import com.dhathika.service.ProductService;
import com.dhathika.service.ProductServiceImpl;
// this is the point for statring the project, just like a controller.
public class ProductController {
	private ProductService service = new ProductServiceImpl();

	public static void main(String[] args) {
		final ProductController  obj = new ProductController();
//	obj.insertProduct();
//       obj.selectAccount();
//		obj.updateAccount();
//		obj.deleteAccount();
		obj.loadMethodExample();
	}

	public void insertProduct() {
//		System.out.println("Enter product details ");
//		System.out.println("Enter product id");
//		Scanner sc = new Scanner(System.in);
//		int pId = sc.nextInt();
//		System.out.println("Enter priduct name");
//		String pName = sc.next();
//		System.out.println("Enter product price ");
//		double pPrice = sc.nextDouble();
//		System.out.println("Enter Brand");
//		String pBrand = sc.next();
//		System.out.println("Enter Manifacturer");
//		String pManiName = sc.next();
//		System.out.println("Enter manifacturing date");
//		System.out.println("Enter the manifacture day");
//		int mDay = sc.nextInt();
//		System.out.println("Enter the manifacture  month");
//		int mMonth = sc.nextInt();
//		System.out.println("Enter the manifacture year");
//		int mYear = sc.nextInt();
//		Date mDate = new Date(mYear, mMonth, mDay);
//		System.out.println("Enter expiry date");
//		System.out.println("Enter the expiry day");
//		int eDay = sc.nextInt();
//		System.out.println("Enter the expiry  month");
//		int eMonth = sc.nextInt();
//		System.out.println("Enter the expiry year");
//		int eYear = sc.nextInt();
//		Date eDate = new Date(eYear, eMonth, eDay);
//		Product product = new Product();
//		product.setpId(pId);
//		product.setpName(pName);
//		product.setpPrice(pPrice);
//		product.setpBrand(pBrand);
//		product.setpManifacturerName(pManiName);
//		product.setpManifuringDate(mDate);
//		product.setpExpiryDate(eDate);
//		service.createProductService(product);

		Product product1 = new Product("Munch", 40.0d, "Britania", "ITC", new Date(2022, 07, 03),
				new Date(2023, 07, 03));
		Product product2 = new Product("Doritoes", 40.0d, "Britania", "ITC", new Date(2022, 07, 03),
				new Date(2023, 07, 03));
		service.createProductService(product1);
		service.createProductService(product2);
		
	}

	public void selectAccount() {
		System.out.println("enter the product Id");
		Scanner sc = new Scanner(System.in);
	 int pId = 	sc.nextInt();
		System.out.println(service.retriveProductService(pId));
	}

	public void updateAccount() {
		Product product1 = new Product(1080, "Kurkure", 20.0d, "ITC", "ITC", new Date(2021, 07, 03),
				new Date(2025, 07, 03),"abc");
		service.updateProductService(product1);
	}

	public void deleteAccount() {
		System.out.println("enter the product Id to delete");
				Scanner sc = new Scanner(System.in);
	 int pId = 	sc.nextInt();
		service.deleteProductService(pId);
	}
	
	public void loadMethodExample() {
		service.loadMethod(2001);
	}

}
