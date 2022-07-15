package com.dhathika.inter;

import java.util.Scanner;

public class RechargeCenter {

	public static void main(String[] args) {

		Mobikwik mobikwik;
		PayTm paytm ;
        int amount =0;
		System.out.println("Choose service ");
		System.out.println("1.Airtel");
		System.out.println("2.Jio");
		System.out.println("3.Vodafone");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			paytm = (PayTm) new Airtel();
			System.out.println("Enter amount ");
			 amount = sc.nextInt();
			 paytm.recharge(amount);
			break;
		case 2:
			paytm = (PayTm) new Jio();
			System.out.println("Enter amount ");
			 amount = sc.nextInt();
			 paytm.recharge(amount);
			break;
		case 3:
			paytm = (PayTm) new Vodafone();
			System.out.println("Enter amount ");
			 amount = sc.nextInt();
			 paytm.recharge(amount);
			break;
	    default : System.out.println("No option available");
		}

	}

}
