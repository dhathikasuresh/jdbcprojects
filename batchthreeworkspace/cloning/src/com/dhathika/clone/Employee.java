package com.dhathika.clone;

public class Employee implements Cloneable{

	int empNo;
	String empName;

	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
