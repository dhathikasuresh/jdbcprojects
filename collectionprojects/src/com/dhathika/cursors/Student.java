package com.dhathika.cursors;

public class Student implements Human{
	
	public int sNo;
	public String sName;
	
	
	
	public Student(int sNo, String sName) {
	
		this.sNo = sNo;
		this.sName = sName;
	}
	
	@Override
	public boolean equals(Object obj) {
	   return false;
	}

	@Override
	public void walk() {
		System.out.println("walks on two legs");
		
	}


}
    	
        
    	

