package com.dhathika.functionalinterfaces;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address address = new Address(51,"Bhagath steet", "Bangalore");
		Contacts contacts = new Contacts(8970373795l,"dhathikasuresh@gmail.com");
		Employee emp1 = new Employee(1020, "rajan", 60000.00, 32,address,contacts);
		
		
		
		
		Employee emp2 =  (Employee) emp1.clone();	
		System.out.println(emp2==emp1);
		emp2.seteName("sandeep");
		emp2.getAddress().setCity("Mumbai");
		emp2.getContacts().setPhNO(7411872687l);
		
		System.out.println(emp1.getAddress()==emp2.getAddress());
	   	
		
		System.out.println("e1 >>" + emp1);
		System.out.println("e2 >>" + emp2);
		
		
	
		

	}

}
