package com.dhathika.oops;

public class Nano extends Vehicle{

	public Nano(int f1, int f2) {
		super(f1, f2);
		// TODO Auto-generated constructor stub
	}
// you never use these kind of structures in real project 
	int wheels;
	String colour;
	float cost;
	
	
	


	@Override
	public void performance() {
		System.out.println("Nano car is a small vehicle , with low performance ");
		System.out.println("Nano is also called as one lakh car, some people make fun saying that its an auto");
		System.out.println("More mileage about 30kmpl");
	}
	
	@Override
	public void powerGeneration() {
		System.out.println("very less power generatin");
		
	}
	
	@Override
	public void running() {
     System.out.println("Not a very good sales and poor market ");
		
	}
	
	@Override
	public void look() {
		System.out.println("look wise ists very good vehicle");
		
	}

     @Override
    public void countryOfOrigin(String str) {
    	// TODO Auto-generated method stub
    	super.countryOfOrigin(str);
    }

	
}
