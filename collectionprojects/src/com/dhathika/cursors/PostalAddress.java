package com.dhathika.cursors;

public class PostalAddress {
	
	String locality;
	String mandal;
	String district;
	String state;
	String country;
	public PostalAddress(String locality, String mandal, String district, String state, String country) {
		super();
		this.locality = locality;
		this.mandal = mandal;
		this.district = district;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "PostalAddress [locality=" + locality + ", mandal=" + mandal + ", district=" + district + ", state="
				+ state + ", country=" + country + "]";
	}
	

}
