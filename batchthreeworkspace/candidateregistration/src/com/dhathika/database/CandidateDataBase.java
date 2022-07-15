package com.dhathika.database;

import java.util.ArrayList;

import com.dhathika.model.Candidate;

public class CandidateDataBase {
	
	public void saveCandidate(Candidate candidate) {
		ArrayList<Candidate> candidateList = new ArrayList<Candidate>();
		candidateList.add(candidate);
		System.out.println(candidateList.size());
	}

}
