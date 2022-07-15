package com.dhathika.deepcloning;

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
		Employee emp = (Employee) super.clone();
		emp.address = (Address) address.clone();
		return emp;
	}

}
