package com.dhathika.oops;

// abstract class 
// is not having any abstract methods then we cal the class concrete class 
public abstract class Vehicle {	
	
	
	int field1;
	int field2;
	
	public Vehicle(int f1, int f2) {
		field1 = f1;
		field2 = f2;
	}
	
	public abstract void running();	
	public abstract void performance();
	public abstract void powerGeneration();
	public abstract void look();
	
    public void countryOfOrigin(String str) {
    	System.out.println("The country it is manifactured is : " + str);
    }

}
