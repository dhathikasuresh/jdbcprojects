package com.dhathika.deepcloning;

public class Address implements Cloneable {
	
	int doorNo;
	String street;
	
	public Address(int doorNo, String street) {
		super();
		this.doorNo = doorNo;
		this.street = street;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

}
