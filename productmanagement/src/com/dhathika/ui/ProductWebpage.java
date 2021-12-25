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
			System.out.println("6.execute batch of statements");
			System.out.println("7.insert a record using prepared stmt");
			System.out.println("8.update a record using prepared stmt");
			System.out.println("9.select all product by price descending order");
			System.out.println("9.select all product by price ascending order");
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
//			case 2:
//				System.out.println("Enter Product number you wnat to update");
//				product.setrNo(sc.nextInt());
//				System.out.println("Enter Product name");
//				product.setsName(sc.next());
//				dao.updateProductRecord(product);
//				break;
			case 3:
				System.out.println("Enter a product id to select a Product");
				int pid = sc.nextInt();
				Product product1 = productSerive.selectProductByPidService(pid);
				System.out.println("the selcted Product is below");
				System.out.println(product1);
				break;
//			case 4:
//				System.out.println("enter a sno to delete a Product record");
//				int sno1 = sc.nextInt();
//				dao.deleteProductRecord(sno1);
//				System.out.println(sno1 + "is deleted from the db");
//				break;
			case 5:
				System.out.println("You selected option of selecting all the Products");
				List<Product> prdList =productSerive.selectAllAvailableProductService();
				for(Product prd: prdList) {
					System.out.println(prd);
				}
				break;
//			case 6:
//				System.out.println("execute batch staments");
//				int[] in = dao.executeBatchOfQueries();
//				for (int i : in) {
//					System.out.println(i);
//				}
//
//				break;
//			case 7:
//				System.out.println("execute preparedstament ");
//				System.out.println("Enter Product roll Number ");
//				product.setrNo(sc.nextInt());
//				System.out.println("Enter Product name");
//				product.setsName(sc.next());
//				System.out.println("enter Product marks");
//				product.setMarks(sc.nextInt());
//				dao.createAProductRecordUsingPStmt(product);
//				break;
//			case 8:
//				System.out.println("Enter Product number you wnat to update");
//				product.setrNo(sc.nextInt());
//				System.out.println("Enter Product name");
//				product.setsName(sc.next());
//				System.out.println("Enter marks too");
//				product.setMarks(sc.nextInt());
//				dao.updateAProductRecordUsingPStmt(product);
//				break;
			default:
				System.out.println("your choice is not present");
				System.exit(0);

			}
		} while (1 != 0);

	}

}
