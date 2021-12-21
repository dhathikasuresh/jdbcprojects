package com.dhathika.functionalinterfaces;

import java.util.Comparator;

public class EmployeeNameCompartor implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
	      return o1.geteName().compareTo(o2.geteName());
	}

}
