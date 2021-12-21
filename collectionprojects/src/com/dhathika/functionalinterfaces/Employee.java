package com.dhathika.functionalinterfaces;

public class Employee implements Comparable<Employee>,Cloneable{
	
	private int eId;
	private String eName;
	private double eSal;
	private int eage;
	private Address address;
	private Contacts contacts;
	
	
	
	public Employee(int eId, String eName, double eSal, int eage, Address address,Contacts contacts) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSal = eSal;
		this.eage = eage;
		this.address = address;
		this.contacts = contacts;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSal() {
		return eSal;
	}
	public void seteSal(double eSal) {
		this.eSal = eSal;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}
	public Contacts getContacts() {
		return contacts;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + eSal + ", eage=" + eage + ", address="
				+ address + ", contacts =" + contacts + "]";
	}
	@Override
	public int compareTo(Employee o) {
	    if(this.eSal==o.eSal)
		return 0;
	    if(this.eSal>o.eSal)
	    	return 1;
	    else
	    	return -1;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee e =(Employee) super.clone();
	    e.setAddress((Address)this.address.clone());
	    e.setContacts((Contacts)this.contacts.clone());
	    return e;
	
	}

}
