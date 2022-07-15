package com.rajan.model;

public class Aadhar {

	private String fName;
	private String lName;
	private int age;
	private boolean pension;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isPension() {
		return pension;
	}

	public void setPension(boolean pension) {
		this.pension = pension;
	}

	public Aadhar() {

	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Aadhar [fName=" + fName + ", lName=" + lName + "]";
	}

}
