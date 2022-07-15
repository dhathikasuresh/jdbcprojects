package com.dhathika.packone;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
//looping statements 
		// when we want to execute a piece of code for multiple times we do use looping statemnets 
		// for 
		// for syntax
		// for(initialization;condition;increment/decrement){
		// statements to execute multiple times
	//}
//		System.out.println("Enter a number you wish to print the table from 1 to till the number ");
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=10;j++) {
//			System.out.println(i+ " X " + j + " = " + i*j );
//			}
//		}
		
		// while loop 
		// syntax
		// while(condition){
		// stmts
		//}
		int n =5;
		int i = 1;
		while(i<=10) {
			System.out.println(n + " X " + i +" = " + n*i);
			i++;
			}
	}
}