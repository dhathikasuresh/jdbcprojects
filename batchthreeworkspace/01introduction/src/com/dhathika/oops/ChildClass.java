package com.dhathika.oops;

public class ChildClass extends ParentClass {

	int num;

	public void callingAMethod() {
		ParentClass pObj = new ParentClass();
		pObj.doSomethingOnGivenString("SANTOSH");
	}

	public static void main(String[] args) {

		ChildClass obj = new ChildClass();
		obj.callingAMethod();
		obj.doSomethingOnGivenString("manoj");
	}

	@Override
	public void doSomethingOnGivenString(String str, int num) {
		System.out.println("own behaviour");
	}

	@Override
	public int doSomethingOnGivenString(int num) {
		// TODO Auto-generated method stub
		return Integer.highestOneBit(num);
	}

	@Override
	public int doSomethingOnGivenString(String str) {
		// TODO Auto-generated method stub
		return super.doSomethingOnGivenString(str);
	}

}
