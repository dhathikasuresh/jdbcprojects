package com.dhathika.oops;

public class Employee {
	
	private int empno;
	private String empName;
	private long contact;
	
	

	
	public int getEmpNo() {
		return this.empno;
	}
	
	public String getEmpName() {
		return this.empName;
	}
    public long getContact() {
    	return this.contact;
    }
    
    public void setEmpNo(int empNo) {
    	if(empNo<0) {
    		System.out.println("Negative employee numbers not allowed");
    	}
    	else
    	this.empno = empNo;
    }
    public void setEmpName(String empName) {
    	
    	for (int i = 0; i < empName.length(); i++) {
			if(empName.charAt(i) == '.') {
				System.out.println("dot not allowed in name");
			}
		}
    	
    	if(empName.length()<3) {
    		System.out.println("Name must have minimum three characters");
    	}
    	else
    	this.empName = empName;
    }
    public void setContact(long contact) {
    	this.contact = contact;
    }
}
