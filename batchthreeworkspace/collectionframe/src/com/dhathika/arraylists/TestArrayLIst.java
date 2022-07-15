package com.dhathika.arraylists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class TestArrayLIst {
	public static void main(String[] args) {
	
		
		ArrayList arrayList = new ArrayList();
		for (int i = 500; i <= 10000; i++) {
			arrayList.add(i);
		}
		TestArrayLIst obj = new TestArrayLIst();
	ArrayList evenList = obj.evenNumberSeparator(arrayList);
	System.out.println(evenList);
	ArrayList oddList = obj.oddNumberSeparator(arrayList);
	System.out.println(oddList);
	}

	private  ArrayList oddNumberSeparator(ArrayList arrayList) {
		
		 ArrayList oddNumberList = new ArrayList();
		    for (int i = 0; i < arrayList.size(); i++) {
				if(((Integer)arrayList.get(i))%2!=0)
					oddNumberList.add(arrayList.get(i));
			}
			return oddNumberList;
	}

	private  ArrayList evenNumberSeparator(ArrayList arrayList) {
	    ArrayList evenNumberList = new ArrayList();
	    for (int i = 0; i < arrayList.size(); i++) {
			if(((Integer)arrayList.get(i))%2==0)
				evenNumberList.add(arrayList.get(i));
		}
		return evenNumberList;
	}
}
