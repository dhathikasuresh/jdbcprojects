package com.dhathika.oops;

public class Person {
	
	private String personName;
	private long personAadharNUmebr;
	private char personGender;
	private long personContact;
	private String personEmail;
	private float personIncome;
	
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public long getPersonAadharNUmebr() {
		return personAadharNUmebr;
	}
	public void setPersonAadharNUmebr(long personAadharNUmebr) {
		this.personAadharNUmebr = personAadharNUmebr;
	}
	public char getPersonGender() {
		return personGender;
	}
	public void setPersonGender(char personGender) {
		this.personGender = personGender;
	}
	public long getPersonContact() {
		return personContact;
	}
	public void setPersonContact(long personContact) {
		this.personContact = personContact;
	}
	public String getPersonEmail() {
		return personEmail;
	}
	public void setPersonEmail(String personEmail) {
		if(personEmail.length()<15)
		{
			System.out.println("mail must have minimum 15 charahcarts");
		}
		else
		this.personEmail = personEmail;
	}
	public float getPersonIncome() {
		return personIncome;
	}
	public void setPersonIncome(float personIncome) {
		this.personIncome = personIncome;
	}
	
	

}
