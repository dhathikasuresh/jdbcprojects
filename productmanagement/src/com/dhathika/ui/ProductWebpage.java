package com.dhathika.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dhathika.dto.Address;
import com.dhathika.dto.Manifacturer;
import com.dhathika.dto.Product;
import com.dhathika.service.ProductSeriveImpl;
import com.dhathika.service.ProductService;


public class ProductWebpage {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Product product = new Product();
		Manifacturer manifacture = new Manifacturer();
		Address address = new Address();
		Scanner sc = new Scanner(System.in);
		ProductService productSerive = new ProductSeriveImpl();

		do {
			System.out.println("select the operation you want to perform");
			System.out.println("1.insert Product");
			System.out.println("2.update Product");
			System.out.println("3.select Product by product id");
			System.out.println("4.delete Product");
			System.out.println("5.select all Products");			
			System.out.println("6.select all product by price descending order");
			System.out.println("7.select all product by pid ascending order");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Product Id Number ");
				product.setPid(sc.nextInt());
				System.out.println("Enter Product name");
				sc.nextLine();
				String pname = sc.next();
				sc.nextLine();
				product.setPname(pname);
				System.out.println("Enter price");
				product.setPprice(sc.nextDouble());
				System.out.println("enter product type");
				product.setPtype(sc.next());
				System.out.println("Enter product weight");
				product.setPweight(sc.nextDouble());
				System.out.println("Enter prodcut Manifacture");
				sc.nextLine();
				String maniname = sc.next();
				sc.nextLine();
				manifacture.setMname(maniname);
				System.out.println("Enter manifacturer address");
				System.out.println("Enter hno");
				address.setHno(sc.nextInt());
				System.out.println("Enter street");
				sc.nextLine();
				String street = sc.next();
				sc.nextLine();
				address.setStreet(street);
				System.out.println("Enter city");
				address.setCity(sc.next());
				System.out.println("Enter state");
				sc.nextLine();
				String country = sc.next();
				sc.nextLine();
				address.setCountry(country);
				System.out.println("Enter pin");
				address.setPin(sc.nextInt());
				manifacture.setAddress(address);
				product.setManifacturer(manifacture);
				productSerive.createProductService(product);
				break;
			case 2:
				System.out.println("Enter Product number you wnat to update");
				int prdNum = sc.nextInt();
				Product selectedProduct =productSerive.selectProductByPidService(prdNum);
				System.out.println(selectedProduct);
				System.out.println("now update the columns you want");
				System.out.println("Enter product name update");
				sc.nextLine();
				selectedProduct.setPname(sc.next());
				sc.nextLine();
				System.out.println("Enter the price you want to update");
				selectedProduct.setPprice(sc.nextDouble());	
				System.out.println("Enter the weight you want to update");
				selectedProduct.setPweight(sc.nextDouble());
				String str = productSerive.updateProductService(selectedProduct);
				System.out.println(str);
				break;
			case 3:
				System.out.println("Enter a product id to select a Product");
				int pid = sc.nextInt();
				Product product1 = productSerive.selectProductByPidService(pid);
				System.out.println("the selcted Product is below");
				System.out.println(product1);
				break;
			case 4:
				System.out.println("enter a product number  to delete a Product record");
				int prdNo = sc.nextInt();
				productSerive.deleteProductService(prdNo);
				System.out.println(prdNo + "is deleted from the db");
				break;
			case 5:
				System.out.println("selecting all the Products");
				List<Product> prdList =productSerive.selectAllAvailableProductService();
				for(Product prd: prdList) {
					System.out.println(prd);
				}
				break;
			case 6:
				System.out.println("select products in price descending order");
				List<Product>  prdList1 = productSerive.selectAllProductsByPriceAscendingOrderService();
				for (Product i :prdList1) {
					System.out.println(i);
				}

				break;
			case 7:
				System.out.println("select products id ascending order");
				List<Product>  prdList2 = productSerive.selectAllProductsByPIdAscendingOrderService();
				for (Product i :prdList2) {
					System.out.println(i);
				}

				break;
			default:
				System.out.println("your choice is not present");
				System.exit(0);
			}
		} while (1 != 0);

	}

}
