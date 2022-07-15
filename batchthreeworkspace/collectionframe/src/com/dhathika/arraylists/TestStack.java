package com.dhathika.arraylists;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class TestStack {

	public static void main(String[] args) {
		
		List arrayList = new ArrayList(); // it allows any kind of object 
		arrayList.add(new String("java"));
		arrayList.add(new Pig("smallpig"));
		// I want restrict the collection to add only one type of objects 
		arrayList.get(0);
		
		Vector<Student> studentstack = new Stack<Student>();
		studentstack.add(new Student(1010, "sriman", "kurnool"));
		studentstack.add(new Student(1020, "srikanth", "kadiri"));
		studentstack.add(new Student(1030, "sri harsha", "madanapalli"));
		studentstack.add(new Student(1040, "srimukhi", "tanakal"));
		studentstack.add(new Student(1050, "sri nandanan", "hyderabad"));
		studentstack.add(new Student(1060, "sri chandana", "tanakal"));
		studentstack.add(new Student(1070, "sri charan", "vepalapalli"));
		studentstack.add(new Student(1080, "srimadan", "mulakalacheruvu"));
		studentstack.add(new Student(1090, "sri sai", "tanakal"));
		studentstack.add(new Student(1000, "sriram", "tanakal"));
	
		Student std1 = new Student(1022, "Mr.A", "Bangalore");
		Student std2 =  new Student(1033, "Mr.B", "Hyderbad");
		if(std1.getStdAddress().equals(std2.getStdAddress())) {
			System.out.println("They both from one place");
		}
		else {
			System.out.println("They both are from different places");
		}
		
//		
//		System.out.println("********************************************");
//		
//		int size = studentList.size();
//	
//		
//		for(int i=0;i<=size;i++) {
//			
//			if(studentList.get(i).stdAddress.equals("tanakal")) {
//				size= size-1;
//				studentList.remove(i);
//				}
//		
//		}
//		
//		System.out.println(studentList.size());


//		System.out.println("********************************************");
//		for(Student a:studentList) {
//			System.out.println("present element process is " + a);
//			if(a.stdAddress=="tanakal") {
//				studentList.remove(a);
//			}
//		
//		}
		
//		System.out.println("size of studentList "  + studentList.size());

		
//		
//		System.out.println("size of studentList "  + studentList.size());
//		
//		System.out.println("********************************************");
		
//		System.out.println(studentList.size());
//		Iterator studentItr = studentList.iterator();
//		// Iterator itr = objectofCollection.iterator();
//
//		while(studentItr.hasNext()) {
//			System.out.println("from Iterator each element");	
//			studentItr.next();
//			studentItr.remove();
//		
//	
//			
//		}
//		System.out.println(studentList.size());
		
		
//		System.out.println("Forward direction");
//		ListIterator<Student> listIterator = studentList.listIterator();
//		while(listIterator.hasNext()) {
//			System.out.println(listIterator.next());
//		}
//		System.out.println("Backword direction");
//		while(listIterator.hasPrevious()) {
//		
//			System.out.println(listIterator.previous());
//		
//		}
		
    Enumeration<Student> enumaration = studentstack.elements();
    while(enumaration.hasMoreElements()) {
    	System.out.println(enumaration.nextElement());
    }
		
	}
	
	
	
}
	




