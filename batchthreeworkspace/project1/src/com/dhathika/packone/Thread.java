package com.dhathika.packone;

public class Thread {

	public static void main(String[] args) {

		methodone();
		System.out.println("Main method");
	}

	private static void methodone() {
		methodtwo();
		System.out.println("Methodone");

	}

	private static void methodtwo() {
		methodthree();
		System.out.println("methodtwo");

	}

	private static void methodthree() {
		System.out.println(" method two called me.");
		System.out.println("Methodthree");

	}

}
