package com.dhathika.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.dhathika.arraylists.Student;

public class SetClasses {

	public static void main(String[] args) {
		    
		
		HashSet set = new HashSet();
		set.add("Naresh");	
		set.add("Vipina");
		set.add("Nandini");		
		set.add(new Student(1010, "Ajay", "Madanapalli"));
		set.add(new Student(1011, "Ajay", "Madanapalli"));
		set.add(new Student(1012, "Ajay", "Madanapalli"));		
//		System.out.println("set size " + set.size());
		
		
//	    for(Object obj : set) {
//	    	System.out.println(obj);
//	    }
//	    
//		Iterator itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
	    
	    
//		LinkedHashSet<Student> studentSet = new LinkedHashSet<Student>();
//	    studentSet.add(new Student(1030, "Mr.A", "Kadiri"));
//	    studentSet.add(new Student(1020, "Mr.B", "Anantapure"));
//	    studentSet.add(new Student(1040, "Mr.C", "Tanakal"));
//	    studentSet.add(new Student(1070, "Mr.D", "Mcu"));
//	    studentSet.add(new Student(1090, "Mr.E", "Madanapalli"));
//	    studentSet.add(new Student(1080, "Mr.F", "Bangalore"));
//	    studentSet.add(null);
	   
	    
//	    for(Object student:studentSet) {
//	    	
//	    		System.out.println(student);
//	    	}
//	    
	    
	    TreeSet<Integer> treeSet = new TreeSet();
	    treeSet.add(13);
	    treeSet.add(19);
	    treeSet.add(23);
	    treeSet.add(9);
	    treeSet.add(4);
	    treeSet.add(1);
	    
	    for(Integer i:treeSet) {
	    	System.out.println(i);
	    }
	    
	    TreeSet<String> stringset = new TreeSet();
	    stringset.add("adiseshu");
	    stringset.add("vipina");
	    stringset.add("naresh");
	    stringset.add("sriman");
	    stringset.add("nandini");
	    stringset.add("ajay");
	    
	    for(String s : stringset) {
	    	System.out.println(s);
	    }
	    
	    TreeSet<Student> studentSet = new TreeSet<Student>();
	    studentSet.add(new Student(10, "Mr.Z", "Kadiri"));
	    studentSet.add(new Student(1080, "Mr.F", "Bangalore"));
	    studentSet.add(new Student(1040, "Mr.C", "Tanakal"));
	    studentSet.add(new Student(1070, "Mr.D", "Mcu"));
	    studentSet.add(new Student(1090, "Mr.E", "Madanapalli"));
	    studentSet.add(new Student(1020, "Mr.B", "Anantapure"));
	    studentSet.add(new Student(1030, "Mr.A", "Kadiri"));
	
	 // We have 1000 Employee objects and duplicates are also exists, I want to see employee list in ascending order
	//    without duplicates     

	    for(Student st: studentSet) {
	    	System.out.println(st);
	    }
	}

}
