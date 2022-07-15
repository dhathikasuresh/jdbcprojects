package com.dhathika.controller;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.dhathika.model.Person;
import com.dhathika.service.PersonService;
import com.dhathika.service.PersonServiceImpl;

public class SaveController {
	 //   How to get the logger object 
	static Logger logger = Logger.getLogger(SaveController.class);	
	public static void main(String[] args) {
		PersonService service = new PersonServiceImpl();
		System.out.println("Enter person details ");	 
		Scanner sc = new Scanner(System.in);
		Person person = new Person();
		System.out.println("Enter person name");
		person.setpName(sc.next());
		System.out.println("Enter person id");
		person.setpId(sc.nextInt());		
		System.out.println(person);
		System.out.println("Passing Object to service" + person);
		 logger.info("Passing Object to service" + person);		
		service.savePerson(person);
		 
		logger.info("Please close the scanner object ");
		logger.error("this is error information");
		logger.trace("This is trace information");
		logger.debug("this is debug information");
		logger.warn("This is warning information");
		logger.fatal("this is fatal information");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
