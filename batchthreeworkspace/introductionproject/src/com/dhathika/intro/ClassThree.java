package com.dhathika.intro;

import java.util.Scanner;

public class ClassThree {

	public static void main(String[] args) {

		System.out.println("Menu");
		System.out.println("a.Idly");
		System.out.println("b.Dosa");
		System.out.println("c.Parota");
		System.out.println("d.Poori");
		System.out.println("e.Vada");

		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice with a charcter above mentioned");
			char choice = (char) sc.nextInt();
			System.out.println("Your choice is  : " + choice);
		switch (choice) {
		case 'a':
			System.out.println("Your choice is idly");
			System.out.println("Each idly costs 5 rupees");
			System.out.println("Please pay number of idlyes you had multiply with 5");
			break;
		case 'b':
			System.out.println("Your choice is Dosa");
			System.out.println("Each Dosa costs  40 rupees");
			System.out.println("Please pay number of Dosa you had multiply with 40 ");
			break;
		case 'c':
			System.out.println("Your choice is Parota");
			System.out.println("Each Parota costs 10  rupees");
			System.out.println("Please pay number of Parota you had multiply with 10 ");
			break;
		case 'd':
			System.out.println("Your choice is Poori");
			System.out.println("Each Poori costs 15 rupees");
			System.out.println("Please pay number of Poori you had multiply with 15");
			break;
		case 'e':
			System.out.println("Your choice is vada");
			System.out.println("Each vada costs 20 rupees");
			System.out.println("Please pay number of vada you had multiply with 20");
			break;
		default:
			System.out.println("your choice is not available");
			System.out.println("Please visit again");

		}
		}while(1>0);

	}
}
