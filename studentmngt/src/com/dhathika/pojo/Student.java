package com.dhathika.pojo;
// pojo plain old java object or dto data transfering object 
public class Student {
	
	private int rNo;
	private String sName;
	private int marks;
	
	
	public int getrNo() {
		return rNo;
	}
	public void setrNo(int rNo) {
		this.rNo = rNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rNo=" + rNo + ", sName=" + sName + ", marks=" + marks + "]";
	}
	
	

}
