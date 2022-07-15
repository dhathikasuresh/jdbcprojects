package com.dhathika.components;

import org.junit.jupiter.api.Test;

class Main3Test {
	
	Main3 obj = new Main3();
	
	
	{
		obj.strReverseUsingString("manoj");
	}

	@Test
	void testStrReverseUsingStringBuffer() {
		obj.strReverseUsingStringBuffer("anantapuram");
	}

	@Test
	void testStrReverseUsingStringBuilder() {
		obj.strReverseUsingStringBuilder("anantapuram");
	}

	@Test
	void testStrReverseUsingString() {
		obj.strReverseUsingString("anantapuram");
	}
}
