package com.dhathika.cursors;

public class Employee {
	int empNo;
	String empName;
	String empLocation;
	String empContact;
	double empSal;
	
	
	public Employee(int empNo, String empName, String empLocation, String empContact, double empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empLocation = empLocation;
		this.empContact = empContact;
		this.empSal = empSal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empContact == null) ? 0 : empContact.hashCode());
		result = prime * result + ((empLocation == null) ? 0 : empLocation.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empNo;
		long temp;
		temp = Double.doubleToLongBits(empSal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Employee other = (Employee) obj;
		if (empContact == null) {
			if (other.empContact != null)
				return false;
		} else if (!empContact.equals(other.empContact))
			return false;
		if (empLocation == null) {
			if (other.empLocation != null)
				return false;
		} else if (!empLocation.equals(other.empLocation))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empNo != other.empNo)
			return false;
		if (Double.doubleToLongBits(empSal) != Double.doubleToLongBits(other.empSal))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empLocation=" + empLocation + ", empContact="
				+ empContact + ", empSal=" + empSal + "]";
	}

	
	
	
}
