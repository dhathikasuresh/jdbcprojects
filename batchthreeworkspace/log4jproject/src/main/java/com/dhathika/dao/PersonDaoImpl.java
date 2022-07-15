package com.dhathika.dao;


import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.dhathika.model.Person;

public class PersonDaoImpl implements PersonDao{
    Logger logger = Logger.getLogger(PersonDaoImpl.class);
	public void savePerson(Person person) {
		 
		List<Person> database = new ArrayList<Person>();
		database.add(person);
		System.out.println("Person object is added to database successfully" + person);

	}

}
