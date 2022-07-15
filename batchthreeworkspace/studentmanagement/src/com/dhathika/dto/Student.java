package com.dhathika.dto;

public class Student {

	private int sno;
	private String sname;
	private int smarks;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSmarks() {
		return smarks;
	}

	public void setSmarks(int smarks) {
		this.smarks = smarks;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
}
