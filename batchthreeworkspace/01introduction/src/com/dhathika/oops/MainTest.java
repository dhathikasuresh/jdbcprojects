package com.dhathika.oops;

public class MainTest {
	
	public static void main(String[] args) {
		
		int k =10;
		ClassChild1 obj = new ClassChild1();
		obj.calculation();
		
		ClassP objp = new ClassP();
		objp.calculation();
		
		ClassP objChild =  new ClassChild1();
		objChild.calculation();
		
	}

}
