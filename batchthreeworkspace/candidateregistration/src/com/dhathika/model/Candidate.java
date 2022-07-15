package com.dhathika.model;

public class Candidate {
	
	private Integer rollNumber;
	private String cName;
	private Integer age;
	private char gender;
	
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Candidate [rollNumber=" + rollNumber + ", cName=" + cName + ", age=" + age + "]";
	}
	
	
	

}
