package com.dhathika.methodchaining;

public class Main {

	public static void main(String[] args) {
	    ClassOne obj = new ClassOne();
	  byte[]  b =  obj.objectCreator().objectgenerator().stringgerenator(1).concat("sumiya").toUpperCase().getBytes();
    for(byte bb : b) {
    	System.out.println((char)bb);
    }
	}

}
