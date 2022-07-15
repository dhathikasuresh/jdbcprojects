package com.elite.daos;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.elite.dto.Employee;
import com.elite.sessionutil.SessionUtil;

public class CreateDAO1 {

	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = (Employee) session.get(Employee.class, 1);

		sop("Employee details are ................");
		sop("Ename :" + employee.getName());
		sop("salary :" + employee.getSalary());
		sop("Desig     :" + employee.getDesignation());
		sop("HouseNo :" + employee.getAddress().getHouseNumber());
		sop("Street :" + employee.getAddress().getStreet());
		sop("City   :" + employee.getAddress().getCity());

		transaction.commit();
		session.close();
	}

	public static void sop(Object object) {
		System.out.println(object);
	}
	

	}


