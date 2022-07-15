package com.vidvaan.ems.model;

import java.time.LocalDate;

public class Employee {
	private int eno;
	private String ename;
	private double esal;
	private LocalDate edob;
	private String ecity;
	public Employee() {
		super();
	}
	public Employee(String ename, double esal, LocalDate edob, String ecity) {
		super();
		this.ename = ename;
		this.esal = esal;
		this.edob = edob;
		this.ecity = ecity;
	}
	
	public Employee(int eno, String ename, double esal, LocalDate edob, String ecity) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.edob = edob;
		this.ecity = ecity;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public LocalDate getEdob() {
		return edob;
	}
	public void setEdob(LocalDate edob) {
		this.edob = edob;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", edob=" + edob + ", ecity=" + ecity
				+ "]";
	}
	
	
	
}
