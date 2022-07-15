package com.dhathika.controller;

import java.util.Scanner;

import com.dhathika.exceptions.AgeNotSupporedException;
import com.dhathika.model.Aadhar;
import com.dhathika.model.Address;
import com.dhathika.service.AadharService;

public class AadharEntrollmentController {
	static AadharService service = new AadharService();

	public static void main(String[] args) throws AgeNotSupporedException {

		do {
			System.out.println("Availabel Aadhar operations");
			System.out.println("1. create aadhar card");
			System.out.println("2.retrive aadhar card");
			System.out.println("3.update aadhar card");
			System.out.println("4.delete aadhar card");
			System.out.println("choose any one operation above");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("your choice is to create aadhar card ");
				createAadharCard();
				break;
			case 2:
				System.out.println("your choice is to retrive aadhar card ");
				retriveAadharCard();
				break;
			case 3:
				System.out.println("your choice is to create aadhar card ");
				updateAadharCard();
				break;
			case 4:
				System.out.println("your choice is to create aadhar card ");
				deleteAadharCard();
				break;
			default:
				System.out.println("your choice in not availbale");

			}
		} while (1 != 0);
	}

	private static void deleteAadharCard() {
		service.retriveAadharService();
		System.out.println("Choose the Aadhar position you want to delete");
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
        service.deleteAadharService(pos);
	}

	private static void updateAadharCard() {
		service.retriveAadharService();
		System.out.println("Choose the Aadhar position you want to update");
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		service.updateAadharService(pos);
	

	}

	private static void retriveAadharCard() {
		service.retriveAadharService();

	}

	public static void createAadharCard() throws AgeNotSupporedException {
		System.out.println("Enter aadhar information ");
		Scanner sc = new Scanner(System.in);
		Aadhar aadhar = new Aadhar();
		Address address = new Address();

		System.out.println("Enter the first name ");
		aadhar.setfName(sc.next());
		System.out.println("Enter the last name");
		aadhar.setlName(sc.next());
		System.out.println("Enter gender");
		aadhar.setGender(sc.next());
		System.out.println("Enter your age");
		aadhar.setAge(sc.nextInt());
		System.out.println("Enter your contact number");
		aadhar.setMobile(sc.nextLong());
		System.out.println("**************************");

		System.out.println("Enter Address details ");
		System.out.println("Enter the street name");
		address.setStreet(sc.next());
		System.out.println("Enter district ");
		address.setDist(sc.next());
		System.out.println("Enter state ");
		address.setState(sc.next());
		System.out.println("Enter country");
		address.setCountry(sc.next());
		System.out.println("Enter pin");
		address.setPin(sc.nextInt());

		aadhar.setAddress(address);

		System.out.println("All entered details " + aadhar);
		service.createAadharService(aadhar);

	}
}
