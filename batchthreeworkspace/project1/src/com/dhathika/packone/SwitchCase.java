package com.dhathika.packone;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		System.out.println("Welcome to Hotel Annapoorna");
		System.out.println("Below is the Menu");
		System.out.println("1. Idly");
		System.out.println("2. Dosa");
		System.out.println("3. Chapati");
		System.out.println("4. Poori");
		System.out.println("5. Pongal");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please Enter your choice");
			int choice = sc.nextInt();
			int no = 0;
			switch (choice) {
			case 1:
				System.out.println("Your choice is Idly, One idly cost is 5 Rupees");
				System.out.println("Enter how many idlies you want");
				no = sc.nextInt();
				System.out.println("Please pay the bill of Rupees :" + no * 5);
				System.out.println("Please take your seat and have your food ");
				break;
			case 2:
				System.out.println("Your choice is Dosa, One Dosa cost is 10 Rupees");
				System.out.println("Enter how many Dosa you want");
				no = sc.nextInt();
				System.out.println("Please pay the bill of Rupees :" + no * 10);
				System.out.println("Please take your seat and have your food ");
				break;
			case 3:
				System.out.println("Your choice is Chapati, One Chapati cost is 15 Rupees");
				System.out.println("Enter how many Chapatis you want");
				no = sc.nextInt();
				System.out.println("Please pay the bill of Rupees :" + no * 15);
				System.out.println("Please take your seat and have your food ");
				break;
			case 4:
				System.out.println("Your choice is Poori, One Poori cost is 8 Rupees");
				System.out.println("Enter how many Pooris you want");
				no = sc.nextInt();
				System.out.println("Please pay the bill of Rupees :" + no * 8);
				System.out.println("Please take your seat and have your food ");
				break;
			case 5:
				System.out.println("Your choice is Pongal, One plate pongal cost is 20 Rupees");
				System.out.println("Enter how many plates of pongal you want");
				no = sc.nextInt();
				System.out.println("Please pay the bill of Rupees :" + no * 20);
				System.out.println("Please take your seat and have your food ");
				break;
			default:
				System.out.println("Your choice is not avaliable in todays menu , please visit again");
			}
		} while (1 > 0);
	}

}
