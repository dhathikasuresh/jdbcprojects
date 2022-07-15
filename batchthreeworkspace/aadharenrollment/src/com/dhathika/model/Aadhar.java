package com.dhathika.model;
// a pojo never depends on any other classes // dto data transfer object 
public class Aadhar {
	
	private String fName;
	private String lName;
	private String gender;
	private Integer age;
	private Long mobile;
	private Address address;
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type =  type;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Long getMobile() {
		return mobile;
	}


	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Aadhar [fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", age=" + age + ", mobile="
				+ mobile + ", address=" + address + ", type=" + type + "]";
	}



	
	

}
