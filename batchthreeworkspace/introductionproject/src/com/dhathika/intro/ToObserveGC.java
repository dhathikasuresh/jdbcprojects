package com.dhathika.intro;

public class ToObserveGC {

	public static void main(String[] args) {
		int r;
		int sum = 0;
		for (int n = 1; n <= 200; n++) {
			int i = n;
			int temp = i;
			while (i > 0) {
				r = i % 10;
				sum = (r * r * r) + sum;
				i= i / 10;
			}
			if (temp == sum)
				System.out.println(temp);
			sum = 0;
		}

	}

}
