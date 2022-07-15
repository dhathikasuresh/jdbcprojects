package com.dhathika.intro;

public class Factorsof496 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factsum = 0;
		int num = 8128;
		for (int i = 1; i <= (num / 2); i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		}

}
