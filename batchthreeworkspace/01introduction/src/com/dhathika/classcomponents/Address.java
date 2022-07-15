package com.dhathika.classcomponents;

public class Address {
	
	 int doorno;
	 String street;
	 String town;
	 String district;
	 String state;
	 String country;
	 int pin;
	 
	

	public Address(int doorno, String street, String town, String district, String state, String country, int pin) {
		
		this.doorno = doorno;
		this.street = street;
		this.town = town;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	
	public  Address() {
	
	}

	  void aTestMethod() {
	
	}
	
	 static void main(String[] args) {
		Address address = new Address();
		address.state = "Andhara pradesh";
		
	}

}
