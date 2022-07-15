package com.dhathika.arrayone;

public class ArrayOne {

	public static void main(String[] args) {
		
     // String is collection of characters 
	// internal structure of String is character array
		// String is only the class can be initialized in literal way ,i.e just initializaing like a primitive variable. 
// String is immutable in nature . 
		
// How many ways we can create a string 
		// Literal way 
		String str1 = "java";
		int a =5;
		// using constructor and new keyword
		String str2 = new String("java");
		String str3 = new String ("java");
		String str4 =  new String("java1");
		
		Integ i = new Integ(9);
		Integ j = new Integ(9);
		
		Strig s1 = new Strig("naresh");
		Strig s2 =  new Strig("naresh");
		
		Naveen newObject = new Naveen();
		newObject.friendName = "naresh";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println("****************");
		System.out.println(i.hashCode());
		System.out.println(j.hashCode());
		System.out.println("******************");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.name.hashCode());
		System.out.println(s2.name.hashCode());
		
		System.out.println("****************");
		System.out.println(newObject.hashCode());
		System.out.println(newObject.friendName.hashCode());

	}

}
