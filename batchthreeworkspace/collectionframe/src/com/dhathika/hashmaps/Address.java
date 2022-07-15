package com.dhathika.hashmaps;

public class Address {
	private String village;
	private String post;
	private String dist;
	private String state;
	private String country;
	public Address(String village, String post, String dist, String state, String country) {
		
		this.village = village;
		this.post = post;
		this.dist = dist;
		this.state = state;
		this.country = country;
	}

	
	public String getVillage() {
		return village;
	}


	public String getPost() {
		return post;
	}


	public String getDist() {
		return dist;
	}


	public String getState() {
		return state;
	}


	public String getCountry() {
		return country;
	}


	@Override
	public String toString() {
		return "Address [village=" + village + ", post=" + post + ", dist=" + dist + ", state=" + state + ", country="
				+ country + "]";
	}

	
	
}
