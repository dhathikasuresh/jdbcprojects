package com.dhathika.oops;

import java.util.Scanner;

public class ClassChild1  extends ClassP{

	
	int fieldone;
	
	public void methodOne() {
		ClassP p = new ClassP();
		p.calculation();
	}	
	
	@Override
	public void calculation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string ");
		String str = sc.next();
		System.out.println(str.length() + " length of the string");

	}
}
