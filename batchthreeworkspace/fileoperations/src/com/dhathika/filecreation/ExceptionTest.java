package com.dhathika.filecreation;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args){
             anIntermediateMethod();
	}
	
	public static void anIntermediateMethod() {
        try {
		System.out.println("Name is : " + nameReader());
        }
        catch(NameNotSupportedException obj) {
        	System.out.println(obj.getMessage());
        	System.out.println(obj.getCause());
        	obj.printStackTrace();
        	StackTraceElement arr[] = obj.getStackTrace();
        	for(StackTraceElement e : arr) {
        		System.out.println(e.getMethodName()  + "  " + e.getLineNumber());
        		
        	}
        	System.out.println("this is localized message "  + obj.getLocalizedMessage());
        }
		System.out.println("Age is : " + ageReader());
	}
	
	public static String nameReader() throws NameNotSupportedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a candidate name");
		String name = sc.next();
		if (name.contains("@")) {
			NameNotSupportedException obj = new NameNotSupportedException("name should not have a special character", new NameNotSupportedException()); 
			throw obj;
		}
		return name;
	}
	public static int ageReader() throws NameNotSupportedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter candidate age");
		int age = sc.nextInt();		
		return age;
	}

}
