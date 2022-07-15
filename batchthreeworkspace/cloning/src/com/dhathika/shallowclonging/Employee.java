package com.dhathika.shallowclonging;

public class Employee implements Cloneable{

	int empNo;
	String empName;
	Address address;

	
	public Employee(int empNo, String empName, Address address) {
		
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
