package com.dhathika.model;

public class Aadhar {	

	private String fName;
	private String lname;
	private int age;
	private String gender;
	private boolean mStatus;
	private String email;
	private Long mobile;
	public Aadhar() {
		
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean ismStatus() {
		return mStatus;
	}
	public void setmStatus(boolean mStatus) {
		this.mStatus = mStatus;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Aadhar [fName=" + fName + ", lname=" + lname + ", age=" + age + ", gender=" + gender + ", mStatus="
				+ mStatus + ", email=" + email + ", mobile=" + mobile + "]";
	}

	

}
