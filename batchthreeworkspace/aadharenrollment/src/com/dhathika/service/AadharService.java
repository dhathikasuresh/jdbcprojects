package com.dhathika.service;

import java.awt.Stroke;

import com.dhathika.exceptions.AgeNotSupporedException;
import com.dhathika.model.Aadhar;
import com.dhathika.store.AadharStore;

public class AadharService {
   AadharStore store = new AadharStore();
	public void createAadharService(Aadhar aadhar) throws AgeNotSupporedException {
		System.out.println("aadhar object enterd into service layer  " + aadhar.getfName());
		String gender = aadhar.getGender();
		if(gender.equalsIgnoreCase("Male")) {
			aadhar.setfName("Mr. "  + aadhar.getfName());
		}
		else {
			aadhar.setfName("Mrs. " + aadhar.getfName());
		}
		
		
		// age < 10 type = kids aadhar
		// age 10-20 type = teen aadhar
		// age >20 adult aadhar
		
		if(aadhar.getAge()==0) 
			throw new AgeNotSupporedException("Age 0  is not a valid age for creating Aadhar");
		
			
		if(aadhar.getAge()>0 && aadhar.getAge()<=10)
			aadhar.setType("kids Aadhar");
		else if(aadhar.getAge()>10 && aadhar.getAge()<=20) 
	         aadhar.setType("teen Aadhar");
		else
			aadhar.setType("Adult aadhar");
		
		System.out.println("Aadhar object is modified and now it looks " +  aadhar);
		store.saveAadharStore(aadhar);
	}
	
	public void retriveAadharService() {
		store.retriveAadharStore();
		
	}
	public void updateAadharService(int pos) {
		store.updateAadharStore(pos);
	}
	public void deleteAadharService(int pos) {
		store.deleteAadharStore(pos);
	}

}
