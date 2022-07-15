package com.string.internalstructure;

import java.util.Properties;

public class MutableTest {

	public static void main(String[] args) {

		String str = new String("naveen");
		System.out.println(str.hashCode());
		str = new String("naresh");
		System.out.println(str.hashCode());
		
		String str1 = "sriram";
		System.out.println(str1.hashCode());
		str1 =  "sriman";
		System.out.println(str1.hashCode());
		
		StringBuffer sbr = new StringBuffer("India"	);
		System.out.println(sbr.hashCode());
		sbr.append(" bharath");
		System.out.println(sbr.hashCode());
		
		Employee emp = new Employee(1010, "naveen", 56000);
		   emp.setEmpName("naveen B");
		   emp = new Employee(1010, "naveen B", 56000);
		
	Properties obj = 	System.getProperties();
	System.out.println(obj.getProperty("os.name"));
		

	}

}
