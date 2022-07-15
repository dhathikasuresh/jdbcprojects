package com.elite.dto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
	@Table(name = "EMP")
	public class Employee {
		@Id
	@GeneratedValue
	@Column(name = "ENO")
		private int eno;
	@Column(name = "NAME")
	private String name;
	@Column(name = "SAL")
	private double salary;
		@Column(name = "DESIG")
	private String designation;
		@Embedded
	@AttributeOverrides( {
	@AttributeOverride(name = "houseNumber", column = @Column(name = "E_HOUSE_NO")),
	@AttributeOverride(name = "street", column = @Column(name = "E_STREET")),
	@AttributeOverride(name = "city", column = @Column(name = "E_CITY")) })
		private Address address;		
		
		
		public int getEno() {
			return eno;
		}
		public void setEno(int eno) {
			this.eno = eno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public Address getAddress() {
			return address;
		}
		public void setAddress(Address address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Employee [eno=" + eno + ", name=" + name + ", salary=" + salary + ", designation=" + designation
					+ ", address=" + address + "]";
		}
		
		

}