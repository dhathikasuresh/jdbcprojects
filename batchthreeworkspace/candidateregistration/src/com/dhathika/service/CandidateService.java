package com.dhathika.service;

import com.dhathika.database.CandidateDataBase;
import com.dhathika.model.Candidate;

public class CandidateService {
	
	public void candidateRegister(Candidate candidate) {
		
		if(candidate.getGender()=='f') {
			candidate.setcName("Miss " + candidate.getcName());
		}
		else {
			candidate.setcName("Mr " + candidate.getcName());
		}
		CandidateDataBase db = new CandidateDataBase();
		db.saveCandidate(candidate);
	}
	
	

}
