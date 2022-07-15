package com.dhathika.filecreation;

import java.util.Scanner;

public class UnderstandingExceptionThrows {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number one");
		int num1 = sc.nextInt();
		System.out.println("Enter number two");
		int num2 = sc.nextInt();	
		 oneIntermediateMethod(num1, num2);		
		System.out.println("Happy ending of Main");
	}
	
	public static void oneIntermediateMethod(int a , int b) {

			divisionResult(a, b);	
		
		
		System.out.println("Happy ending of method oneIntermediateMethod()");
		
	}
	
	public static int divisionResult(int a, int b){
		int result =0;	
//		try {
		 result = a/b;
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
		System.out.println("Happy ending of Method divisionResult()");
		return result;
	}
}
