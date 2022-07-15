package com.dhathika.inter;

public class TestAbstract {

	public static void main(String[] args) {
		
		ChildForAbstract obj = new ChildForAbstract(13, "pawan", 63.96f);
		char[] arr = obj.stringReverse();
		int square = obj.squareANumber();
		int rounded = obj.roundAFloat();
		int squareResult = obj.methodOne(25);
		
		Seshu seshu = new Seshu();

		
	}
}
