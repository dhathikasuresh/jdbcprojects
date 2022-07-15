package com.dhathika.packone;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathOperationsTest {
	MathOperations obj = new MathOperations();
	Scanner sc = null;
	
	@BeforeEach
     public  void testBefore() {
		sc= new Scanner(System.in);
    	 System.out.println("Opened a scanner object ");
     }
	
	@Test
	void testSquareANumber() {
		int inputSquare = 0;
		int input = 0;
		System.out.println("Enter a number to square");
		System.out.println(sc);
		if(sc !=null) {
			System.out.println("scanner is not null");
		 input = sc.nextInt();
		 inputSquare = input * input;
		System.out.println(inputSquare);
		}
	assertEquals(inputSquare, obj.squareANumber(input));
	}
	
	@Test
	void testSquareNumber2() {
		System.out.println("one more method");
	}
	@Test
	void testSquareNumber3() {
		System.out.println("one more method");
	}
	@Test
	void testSquareNumber4() {
		System.out.println("one more method");
	}

	@Test
	void testAdditionOfTwoNumbers() {
	assertEquals(25, obj.additionOfTwoNumbers(10, 15));
	}

	@Test
	void testStringReverse() {
		assertEquals("namirs", obj.stringReverse("sriman"));
		
	}
	@AfterEach
	public  void  testAfter() {
		sc.close();
		System.out.println(" Scanner closed ");
	}

}
