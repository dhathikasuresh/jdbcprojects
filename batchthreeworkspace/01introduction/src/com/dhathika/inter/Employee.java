package com.dhathika.inter;

public class Employee extends Object {
	
	int empNo;
	String empName;
	int salary;
	
	public Employee(int empNo, String empName, int salary) {
		
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + "]";
	}
	


}
