package com.dhathika.model;

public class Address {

	private String street;
	private String dist;
	private String state;
	private String country;
	private Integer pin;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", dist=" + dist + ", state=" + state + ", country=" + country + ", pin="
				+ pin + "]";
	}

}
