package com.elite.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.elite.dto.Employee;
import com.elite.sessionutil.SessionUtil;

public class HQLPractice {

	public static void main(String[] args) {
		
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		
	
		
		Query updateQuery = session.createQuery("UPDATE  Employee e SET e.name='ranga' WHERE e.eno=1");
		int rowsUpdated = updateQuery.executeUpdate();
		
		System.out.println(("No.of rows updated :" + rowsUpdated));

	
		Query deleteQuery = session.createQuery("DELETE FROM Employee e WHERE e.name LIKE 'C%' AND e.salary>4000");
		int rowDeleted = deleteQuery.executeUpdate();
	
		System.out.println("no.of rows deleted :" + rowDeleted);

		
		Query selectQuery = session.createQuery("SELECT e FROM Employee e");
		List<Employee> emplist = selectQuery.list();
		transaction.commit();
		System.out.println(emplist);

	}

}
