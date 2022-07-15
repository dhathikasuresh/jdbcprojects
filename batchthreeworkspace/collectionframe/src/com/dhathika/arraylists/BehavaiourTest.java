package com.dhathika.arraylists;

import java.util.ArrayList;
import java.util.LinkedList;

public class BehavaiourTest {

	public static void main(String[] args) {
		
		ArrayList arrayList = new ArrayList();
		for (int i = 101; i < 1000000; i++) {
			arrayList.add(i);
		}
		
		long timeJustBeforegetfromArrayList =  System.nanoTime();
		arrayList.remove(100);
		long timeJustAftergetfromArrayList =  System.nanoTime();
       long timeTakenForGetofArrayList = timeJustAftergetfromArrayList -  timeJustBeforegetfromArrayList;
       System.out.println("ArrayList Retrival : "  + timeTakenForGetofArrayList);
       
       LinkedList linkedList = new LinkedList();
		for (int i = 101; i < 1000000; i++) {
			linkedList.add(i);
		}
		
		long timeJustBeforegetfromlinkedList =  System.nanoTime();
		linkedList.remove(100);
		long timeJustAftergetfromlinkedList =  System.nanoTime();
      long timeTakenForGetoflinkedList = timeJustAftergetfromlinkedList -  timeJustBeforegetfromlinkedList;
      System.out.println("LinkedList Retrival : "  + timeTakenForGetoflinkedList);
    
	}

}
