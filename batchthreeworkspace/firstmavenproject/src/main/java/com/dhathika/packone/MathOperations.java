package com.dhathika.packone;

public class MathOperations {
	
	public int squareANumber(int number) {		
		return number*number;
	}
	public int additionOfTwoNumbers(int num1, int num2) {
		return num1+num2;		
	}
	public String stringReverse(String string) {
		return new StringBuffer(string).reverse().toString();
	}

}
