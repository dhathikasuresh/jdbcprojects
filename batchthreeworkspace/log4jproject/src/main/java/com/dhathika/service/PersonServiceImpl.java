package com.dhathika.service;

import com.dhathika.dao.PersonDao;
import com.dhathika.dao.PersonDaoImpl;
import com.dhathika.model.Person;

public class PersonServiceImpl implements PersonService{

	public void savePerson(Person person) {
		System.out.println("Recived an person object :" + person);
		PersonDao dao = new PersonDaoImpl();
		String name = person.getpName();
		name = "sri " + name;
		person.setpName(name);
		System.out.println("Sending person object to dao layer   " +  person);
		
		dao.savePerson(person);
		
		
	
		
	}

}
