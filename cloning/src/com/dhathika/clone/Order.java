package com.dhathika.clone;

public class Order implements Cloneable{
	
	private int oid;
	private String otype;
	private double ovalue;
	private Address daddress;
	public Order(int oid, String otype, double ovalue, Address daddress) {
		super();
		this.oid = oid;
		this.otype = otype;
		this.ovalue = ovalue;
		this.daddress = daddress;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOtype() {
		return otype;
	}
	public void setOtype(String otype) {
		this.otype = otype;
	}
	public double getOvalue() {
		return ovalue;
	}
	public void setOvalue(double ovalue) {
		this.ovalue = ovalue;
	}
	public Address getDaddress() {
		return daddress;
	}
	public void setDaddress(Address daddress) {
		this.daddress = daddress;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", otype=" + otype + ", ovalue=" + ovalue + ", daddress=" + daddress + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	

}
