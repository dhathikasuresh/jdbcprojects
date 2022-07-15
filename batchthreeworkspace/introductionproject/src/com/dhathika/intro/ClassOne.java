package com.dhathika.intro;

public class ClassOne {

	public static void main(String[] args) {
		int factsum = 0;
		for (int i = 1; i <= 10000; i++) {
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					factsum = factsum + j;
				}			
			}
			if(factsum==i) {
				System.out.println(i);
			}
			factsum = 0;
		}
	}
}
// 1,2,4,8,
