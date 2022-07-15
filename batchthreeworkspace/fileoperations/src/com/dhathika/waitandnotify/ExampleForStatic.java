package com.dhathika.waitandnotify;

public class ExampleForStatic {
	
	public static int staticField = 10;
	public int nonStaticField;
	
	
	public static void staticMethod() {
		System.out.println(staticField);		
		System.out.println("static method content");
	}
	static {
		System.out.println("I am static method");
		staticMethod();
		ExampleForStatic obj = new ExampleForStatic();
		}
	
	{
		System.out.println("I am a instance block");
		nonStaticMethod();
	}
	public void nonStaticMethod() {
		System.out.println(staticField);
		System.out.println(nonStaticField);
		System.out.println(" I am a non static method");
	}

}
