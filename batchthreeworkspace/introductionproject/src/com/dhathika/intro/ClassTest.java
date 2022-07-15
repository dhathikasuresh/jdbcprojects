package com.dhathika.intro;

public class ClassTest {

	public int method1(int i, int j) {
		return i + j;
	}

	public int method1(float i) {
		return (int) (i * i);
	}

	public int method1(double i) {
		return (int) (i * i * i);
	}

	public int method1(boolean i) {
		if (i == true)
			return 1;
		else
			return 0;
	}

	public int method1(long i) {
		return (int) i;
	}

	public int method1(char i) {
		return i;

	}

}
