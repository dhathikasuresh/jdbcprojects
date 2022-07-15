package com.dhathika.oops;

import java.util.Scanner;

public class ClassP {
	
	public void calculation() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("result is = " + (num1+num2));
	}
	
	public void calculation(String str) {		
		
		System.out.println("length of the string  is = " + (str.length()));
	}
	
	public void calculation(String str, int beginIndex, int endIndex) {
		
		System.out.println("the substring with what the offset and count you passed is"
				+ " " + str.substring(beginIndex, endIndex));
	}
	
	public static void main(String[] args)  {
	
		
		ClassP obj = new ClassP();
		obj.calculation("programming language ", 0, 30);
		
		String str = "abc";
		System.out.println(str.charAt(3));
	}
	
}
