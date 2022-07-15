package com.rajan.servlce;

import com.rajan.model.Aadhar;
import com.rajan.repository.AadharRepository;

public class AadharService {
	
	AadharRepository repo = new AadharRepository();
	
	public void registerAadhar(Aadhar aadhar) {
		if(aadhar.getAge()>60) {
			aadhar.setPension(true);
		}
		else {
			aadhar.setPension(false);
		}
		repo.saveAadharToDB(aadhar);
	}

}
