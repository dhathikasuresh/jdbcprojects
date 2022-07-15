package com.dhathika.inter;

public abstract class AbstractClassOne {
	
	int field1;
	String field2;
	float field3;
	
//	public AbstractClassOne(int field1, String field2, float field3) {
//		
//		this.field1 = field1;
//		this.field2 = field2;
//		this.field3 = field3;
//	}
	
	
	public AbstractClassOne(int field1, String field2) {
		
		this.field1 = field1;
		this.field2 = field2;
	}


	public abstract int methodOne(int a);
	
	public char[] stringReverse() {
		char[] charArray = new char[this.field2.length()];
		int j = 0;
		for(int i = this.field2.length()-1;i>=0;i--) {
			charArray[j] = field2.charAt(i);
			j++;
		}
		return charArray;
	}
	
	public int squareANumber() {
		return this.field1 * this.field1;
	}
    public int roundAFloat() {
    	System.out.println(this.field3);
    	return (int)field3;
    }

}
