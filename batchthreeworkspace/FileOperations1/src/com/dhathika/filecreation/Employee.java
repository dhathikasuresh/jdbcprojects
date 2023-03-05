package com.dhathika.filecreation;

import java.io.Serializable;

public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 109210428563l;
	int id;
	String name;
	
	public Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
	
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


}
