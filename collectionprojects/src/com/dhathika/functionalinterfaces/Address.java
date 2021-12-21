package com.dhathika.functionalinterfaces;

public class Address implements Cloneable{
     private int hNo;
     private String street;
     private String city;
     
   
	public Address(int hNo, String street, String city) {
	
		this.hNo = hNo;
		this.street = street;
		this.city = city;
	}


	public int gethNo() {
		return hNo;
	}


	public void sethNo(int hNo) {
		this.hNo = hNo;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", street=" + street + ", city=" + city + "]";
	}
   
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
     
    
}
