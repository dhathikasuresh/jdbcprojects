package com.dhathika.inter;

import java.util.Scanner;

public class ClassComponents {
	
	public int field1;
	public String field2;
	public float field3;
	public static String staticField;
	
	public ClassComponents(int f1,String f2, float f3, String f4) {
		field1 = f1;
		field2 = f2;
		field3 = f3;
		staticField = f4;
	}
	public ClassComponents() {
		
	}
	
	public String methodOne() {
		
		if(field1%2==0) {
	return "even";
		}
		else {
			return "odd";
		}
		
		
	}
	
  public static void main(String[] args) {
//	  ClassComponents obj = new ClassComponents(1010, "ajay", 83.16f, "svit");
	  ClassComponents obj1 = new ClassComponents();
	  String returnedvalue1 = obj1.methodOne();
	  System.out.println(returnedvalue1);
	
	  ClassComponents obj2 =  new ClassComponents(101, "naresh", 96.3f, "kumar");
	  String returnedvalue2 = obj2.methodOne(); 
	  System.out.println(returnedvalue2);
	  
}
}
