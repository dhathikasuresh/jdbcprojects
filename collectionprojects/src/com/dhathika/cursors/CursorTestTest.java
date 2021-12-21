package com.dhathika.cursors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class CursorTestTest {
	
	CursorTest obj = new CursorTest();
	List<Student> list;
	
	
	
	
	@Test
	void testArrayListPerformance() {
		 list = new ArrayList<Student>();
		 
	    	for(int i =0; i <=100000;i++) {
	    		list.add(new Student(1010, "rajan"));
	    	}
		System.out.println(list.get(0));
	   obj.arrayListPerformance(list);
	}

	@Test
	void testLinkedListPerformance() {
		 list = new LinkedList<>();
	    	for(int i =0; i <=100000;i++) {
	    		list.add(new Student(1010, "rajan"));
	    	}
		System.out.println(list.get(0));
		obj.linkedListPerformance(list);
	}

}
