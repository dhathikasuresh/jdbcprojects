package com.dhathika.components;

public class Main3 {
	
	public StringBuffer strReverseUsingStringBuffer(String str) {
		
		System.out.println("entry");

		return new StringBuffer(str).append("in Andhra Pradesh").append("in india").append("133456789");
		
	}

	public StringBuilder strReverseUsingStringBuilder(String str) {

		return new StringBuilder(str).append("in Andhra Pradesh").append("in india").append("133456789");
	}
	
	public String strReverseUsingString(String str) {

		return new String(str) + "in Andhra Pradesh" + "in india" +  "133456789";
	}

	

}
