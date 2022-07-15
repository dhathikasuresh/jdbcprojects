package com.dhathika.filecreation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 5429180639230113256L;
	int empId;
	String empName;
	double empSal;	
	String contact;
	Scanner sc = new Scanner(System.in);
	File file = new File("C://files//newfile5.txt");

     public Employee() {
    	 
     }
	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Employee(int empId, String empName, double empSal) {

		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		
		System.out.println(empId  + " object is created ");
	}	

	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public double getEmpSal() {
		return empSal;
	}


	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

   public void employeeRegistration() throws IOException {
	
	
	   FileOutputStream fos = new FileOutputStream(file);
	   fos.write(empId);
	   sc.nextInt();
   }
	
   @Override
protected void finalize() throws Throwable {
	 System.out.println( empId  + " called finalize() method");
     sc.close();
  
     
}
}
