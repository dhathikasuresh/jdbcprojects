package com.dhathika.classcomponents;

// single inheritance
public class ScientificCalculator extends StandardCalculator{
	
	public  int[] binaryNumberCreator(int number) {
		int[] binary = new int[10]; 
		int i = 0;
		
		while(number > 0) {		
			binary[i] = number %2;
			i++;
			number = number/2;
		}
		return binary;
	}
	
	public  int[] octalNumberCreator(int number) {
		int[] octal = new int[10]; 
		int i = 0;		
		while(number > 0) {		
			octal[i] = number %8;
			i++;
			number = number/8;
		}
		return octal;
	}
	
	public double interestCalculator(double principle, int time , int rate) {
		double interest = (principle * time * rate)/100;
		return interest;
	}
	
}
