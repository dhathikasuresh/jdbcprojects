package com.dhathika.intro;

public class Loader {

	static {
		System.out.println("Hey I am static block ");
		int a = 200;
		if (a % 10 == 0) {
			System.out.println("the given number is divible by 10");
		}
	}
	
	/** this method returns the square of the number passed to it **/
	public static int squareOfPassedNumber(int i) {
		return i * i;
	}

	{
		System.out.println("Hey I am nonstatic block ");
		int a = 16;
		if (a % 2 == 0) {
			System.out.println("the given number even");
		}

	}

	public int cubeOfPassedNumber(int i) {
		return i * i * i;
	}
}
