package com.dhathika.cursors;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std1 = new Student(1010,"rajan");
		Student std2 = new Student(1010,"rajan");
		Student std3 = new Student(1050,"rajan");
		Student std4 = new Student(1060,"rajan");
		Student std5 = new Student(1060,"rajan");
		String str = "rajan";
		
		Order ord1 = new Order(1020,"Tv");
		
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		System.out.println(std3.hashCode());
		System.out.println(std4.hashCode());
		
		System.out.println(std5.equals(std4));
		
		Set<Student> stdSet = new HashSet<Student>();
		
		stdSet.add(std1);
		stdSet.add(std2);
		stdSet.add(std1);
		stdSet.add(std4);
		System.out.println(stdSet.size());
		
		if(ord1 instanceof Student) {
			
		}
		
	

	}

}
