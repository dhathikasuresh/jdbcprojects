package com.dhathika.intro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MethodOverloadingExample {

	public static void main(String[] args) {
  
		List<String> list = new ArrayList<String>();
		list.add("rajan");
		list.add("vipina");
		list.add("suresh");
		list.add("java");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		
	System.out.println(list.size());
	}
	
	
}
