package com.dhathika.dbtest;

public class Load {

	
	public static void staticMethod() {
		System.out.println("hi I am a static method I no need of object to execute, you can call me using class name");
	}
	
  static {
	  System.out.println("Hi I am a static block , you no need to execute me at all, if you load into the java I will execute my statements");
  }
  
   {
	  System.out.println("Hi I am a non static block , I will get execute immediately after creating the object ");
  }
  
}
