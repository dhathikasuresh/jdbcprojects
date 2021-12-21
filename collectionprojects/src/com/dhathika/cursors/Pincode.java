package com.dhathika.cursors;

public class Pincode {
	
	int postalCode;

	public Pincode(int postalCode) {
		super();
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Pincode [postalCode=" + postalCode + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + postalCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pincode other = (Pincode) obj;
		if (postalCode != other.postalCode)
			return false;
		return true;
	}
	
	

}
