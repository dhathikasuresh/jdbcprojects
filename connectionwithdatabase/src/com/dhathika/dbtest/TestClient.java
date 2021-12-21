package com.dhathika.dbtest;

public class TestClient {

	public static void main(String[] args) throws ClassNotFoundException {
	Class.forName("com.dhathika.dbtest.Load");
	
	Load.staticMethod();
	
	Load load = new Load();

	}

}
