package com.dhathika.functionalinterfaces;

public class Contacts implements Cloneable{
       private long phNO;
       private String email;
	public Contacts(long phNO, String email) {
	
		this.phNO = phNO;
		this.email = email;
	}
	public long getPhNO() {
		return phNO;
	}
	public void setPhNO(long phNO) {
		this.phNO = phNO;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contacts [phNO=" + phNO + ", email=" + email + "]";
	}
       
      @Override
    protected Object clone() throws CloneNotSupportedException {
    	// TODO Auto-generated method stub
    	return super.clone();
    } 
}
