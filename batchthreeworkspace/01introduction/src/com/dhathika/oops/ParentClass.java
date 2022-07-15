package com.dhathika.oops;

public class ParentClass {
	
	
	public void doSomethingOnGivenString(String str,int num) {
		String str1 = str.toLowerCase();
		System.out.println(str1);
	}	
	
	public int doSomethingOnGivenString(String str) {
		String str1 = str.toLowerCase();
		System.out.println(str1);
		return 0;
	}
	
	public int doSomethingOnGivenString(int str) {
		
		System.out.println(str);
		return 0;
	}
	
	
	public void test() {
		doSomethingOnGivenString("venkatesh");
	}

}
