package com.dhathika.arraylists;

import java.util.Scanner;

public class PrintMain {

	public static void main(String[] args) {

//		Print print = new PrintImplementation();
//		print.printing();
		
		PrintMain main = new PrintMain();
		Print print1 = main.printMethodImpl1();
		print1.printing();
		print1.scanning();
		
		Print print2 =  main.printMethodImpl2();
		print2.printing();
		print2.scanning();

	}

	public Print printMethodImpl1() {
		return new Print() {
			@Override
			public void printing() {
				for (int i = 1; i < 10; i++) {
					System.out.println(10 + " X " + i + " = " + 10 * i);
				}

			}

			@Override
			public void scanning() {
				System.out.println("Scanning is in progress");
				
			}

		};
	
	}

	public Print printMethodImpl2() {
		return new Print() {
			@Override
			public void printing() {
				System.out.println("a epson printer printing");
			}

			@Override
			public void scanning() {
				System.out.println("Enter some thing");
			Scanner sc = new Scanner(System.in);
			String something = sc.next();
			System.out.println(something);
				
			}
		};
		
	}

}
