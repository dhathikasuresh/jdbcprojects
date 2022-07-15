package com.elite.daos;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.elite.dto.Address;
import com.elite.dto.Employee;
import com.elite.sessionutil.SessionUtil;

public class CreateDAO2 {

	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();

		Address address = new Address();
		address.setHouseNumber("151-C");
		address.setStreet("SV COLON");
		address.setCity("TPT");

		Employee employee = new Employee();		
		employee.setName("RAMESH");
		employee.setDesignation("TEACHER");
		employee.setSalary(32000);
		employee.setAddress(address);

		session.save(employee);

		transaction.commit();
		session.close();
	}


	}


