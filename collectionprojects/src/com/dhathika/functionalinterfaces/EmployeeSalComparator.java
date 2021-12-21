package com.dhathika.functionalinterfaces;

import java.util.Comparator;

public class EmployeeSalComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		 if(o1.geteSal()==o2.geteSal())
			 return 0;
		 else if(o1.geteSal()<o2.geteSal())
		return -1;
		 else
			 return 1;
	}

}
