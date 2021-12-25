package com.dhathika.dto;

public class Product {
	
	
	private int pid;
	private String pname;
	private double pprice;
	private String ptype;	
	private double pweight;
	private Manifacturer manifacturer;
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPprice() {
		return pprice;
	}
	public void setPprice(double pprice) {
		this.pprice = pprice;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public Manifacturer getManifacturer() {
		return manifacturer;
	}
	public void setManifacturer(Manifacturer manifacturer) {
		this.manifacturer = manifacturer;
	}
	public double getPweight() {
		return pweight;
	}
	public void setPweight(double pweight) {
		this.pweight = pweight;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", ptype=" + ptype + ", pweight="
				+ pweight + ", manifacturer=" + manifacturer + "]";
	}
	
	
	

}
