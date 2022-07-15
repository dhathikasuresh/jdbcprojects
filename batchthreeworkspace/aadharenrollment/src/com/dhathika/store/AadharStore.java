package com.dhathika.store;

import java.util.ArrayList;
import java.util.Scanner;

import com.dhathika.model.Aadhar;

public class AadharStore {
	ArrayList<Aadhar> aadharList = new ArrayList<Aadhar>();
	 
	public void saveAadharStore(Aadhar aadhar) {
		System.out.println("Aadhar entered into storage layer " +  aadhar.getfName());
		 
		aadharList.add(aadhar);
		System.out.println("addhar is added to aadharlist successfully  " +  aadharList);
		
	}
	public void retriveAadharStore() {
		for(Aadhar a: aadharList)
         System.out.println(a);
		
	}
	public void updateAadharStore(int pos) {
		Scanner sc = new Scanner(System.in);
		Aadhar aadhar = aadharList.get(pos);
		System.out.println("Enter a new name");
		aadhar.setfName(sc.next());
		aadharList.remove(pos);
		aadharList.add(pos, aadhar);
		
	}
	public void deleteAadharStore(int pos) {
	   aadharList.remove(pos);
	   for(Aadhar a: aadharList) {
		   System.out.println(a);
	   }
		
	}

}
