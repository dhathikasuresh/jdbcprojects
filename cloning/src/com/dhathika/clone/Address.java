package com.dhathika.clone;

import java.io.Serializable;

public class Address implements Cloneable,Serializable{
	
	 int hno;
	 String street;
	 String city;
	 String country;
	 int pin;
	

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + ", country=" + country + ", pin=" + pin
				+ "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
