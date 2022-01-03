package com.dhathika.clone;

public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address add = new Address();
		add.hno=13;
		add.street="BoseStreet";
		add.city="Hyd";
		add.country="India";
		add.pin=515571;
		
		Subject subject = new Subject();
		subject.sub1="maths";
		subject.sub2="physics";
		subject.sub3="chem";
		Student std1 = new Student();
		std1.sno=1050;
		std1.sname = "Mahesh";
		std1.address=add;
		std1.subjects=subject;
		
		
		System.out.println(std1);
		Student std2 = (Student) std1.clone();
		System.out.println(std2);
		
		System.out.println("*****************************************");
		
		std1.sname="Ramesh";
		std2.subjects.sub1="stats";
		System.out.println(std1);
		System.out.println(std2);
		
		
		System.out.println("*****************************************");
		std1.address.country="Srilanka";
		System.out.println(std1);
		System.out.println(std2);
		
	
	
			
				
				
	}

}
