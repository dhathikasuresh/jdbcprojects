package com.dhathika.components;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		do {

		System.out.println("Menu");
		System.out.println(" 1. coffeee   Cost : 10");
		System.out.println(" 2. juice     Cost : 30");
		System.out.println(" 3. cake      Cost : 50");
		System.out.println("Enter you choice ");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String choice = sc.next();
		System.out.println("Your choice is " + choice);
		switch (choice) {
		case "coffee":
			System.out.println("Enter number coffees you want");
			 num = sc.nextInt();
			System.out.println("Your bill is Rs : " + num * 10);
			break;
		case "juice":
			System.out.println("Enter number juice you want");
			 num = sc.nextInt();
			System.out.println("Your bill is Rs : " + num * 10);
			break;
		case "cake":
			System.out.println("Enter number cake you want");
			 num = sc.nextInt();
			System.out.println("Your bill is Rs : " + num * 10);
			break;
		default : System.out.println("Choice is not availabel");
		}
		}while(1>0);

	}

}
