package com.elite.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.elite.dto.Employee;
import com.elite.sessionutil.SessionUtil;

public class CriteriaPractice {

	public static void main(String[] args) {
		
		Session session = SessionUtil.getSession();
		Transaction transaction = session.beginTransaction();
		
		// SELECT * FROM Employee
		Criteria criteria = session.createCriteria(Employee.class);

		// NAME=’A’
		Criterion nameCriterion = Restrictions.ne("name", "D");

		// salary>1800
		Criterion balanceCriterion = Restrictions.lt("salary", 1800.0);

		// NAME=’A’ AND salary>1800
		Criterion orCriterion = Restrictions.or(nameCriterion, balanceCriterion);

		// SELECT * FROM Employee WHERE NAME=’D’ AND salary>1800;
		
		criteria.add(orCriterion);

		List<Employee> empList = criteria.list();
		for (Employee emp : empList) {
			System.out.println(emp);
		}

	}

}
