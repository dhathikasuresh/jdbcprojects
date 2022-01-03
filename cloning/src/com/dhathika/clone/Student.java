package com.dhathika.clone;

public class Student implements Cloneable{
	
	int sno;
	String sname;
	Address address;
	Subject subjects;
	
@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", address=" + address + ", subjects=" + subjects + "]";
	}

@Override
protected Object clone() throws CloneNotSupportedException {
	Student std = (Student) super.clone();
	std.subjects = (Subject) this.subjects.clone();
	std.address =(Address) this.address.clone();
	return std;	
}
}
