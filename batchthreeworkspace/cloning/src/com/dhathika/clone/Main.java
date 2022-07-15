package com.dhathika.clone;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1 = new Employee(1010, "Naresh");
		System.out.println(emp1);
		Employee emp2 = (Employee) emp1.clone();	  
	     System.out.println(emp2);
         
	}
	
}
