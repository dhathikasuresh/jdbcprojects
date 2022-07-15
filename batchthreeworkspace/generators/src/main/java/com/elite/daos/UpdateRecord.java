package com.elite.daos;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.elite.dto.Employee;
import com.elite.sessionutil.SessionUtil;

public class UpdateRecord {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();

		Employee employee = (Employee) session.get(Employee.class, 1);
		employee.setSalary(5698.0);
		employee.getAddress().setHouseNumber("PIN-45-1");

		transaction.commit();
		session.close();
	}

}
