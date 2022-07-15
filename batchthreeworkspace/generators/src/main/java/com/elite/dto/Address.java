package com.elite.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
		@Column(name = "HOUSE_NO")
	private String houseNumber;
	@Column(name = "STREET")
		private String street;
		@Column(name = "CITY")
	private String city;
		public String getHouseNumber() {
			return houseNumber;
		}
		public void setHouseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
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
			return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + "]";
		}
		
			
}