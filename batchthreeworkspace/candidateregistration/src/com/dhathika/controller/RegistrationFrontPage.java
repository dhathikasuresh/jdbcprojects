package com.dhathika.controller;

import java.util.Scanner;

import com.dhathika.model.Candidate;
import com.dhathika.service.CandidateService;

public class RegistrationFrontPage {

	public static void main(String[] args) {
		
		
     System.out.println("welcome to registration page");
        Scanner sc = new Scanner(System.in);
        Candidate can = new Candidate();
        System.out.println("Enter you roll number ");
        can.setRollNumber(sc.nextInt());
        System.out.println("Enter candidate Name");
        can.setcName(sc.next());
        System.out.println("Enter candidate age");
        can.setAge(sc.nextInt());
        System.out.println("Enter candidate gender  F for Female, M for Male");
        can.setGender(sc.next().charAt(0));
        
       CandidateService canserve = new CandidateService();
       canserve.candidateRegister(can);
        
	}

}
