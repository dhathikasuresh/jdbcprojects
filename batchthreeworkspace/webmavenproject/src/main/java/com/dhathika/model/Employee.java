package com.dhathika.model;

public class Employee {
	
	// fields 
	private int empId;
	private String fname;
	private String mname;
	private String lname;
	private  String course;
	private String gender;
	private long phone;
	private String address;
	private String email;
	private String password;
	private String confirmPassword;
	
	// method
	public int getEmpId() {
		return empId;
	}
	// method
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	// constructor 
	public Employee() {
	
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", course="
				+ course + ", gender=" + gender + ", phone=" + phone + ", address=" + address + ", email=" + email
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}
	{
		
	}
	static {
		
	}
	

}
