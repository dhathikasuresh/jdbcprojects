package com.dhathika.functionalinterfaces;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getEage()==o2.getEage()) {
			return 0;
		}
		else if(o1.getEage()<o2.getEage())
		return -1;
		else
			return 1;
		
	}

}
