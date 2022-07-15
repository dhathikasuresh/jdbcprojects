package com.dhathika.intro;

public class AreaCaliculator {

	public float area(float r) {
		System.out
				.println(" I received only one parameter and considering it as radius and caliculation area of circle");
		float area = (float) (3.14 * r * r);
		return area;
	}

	public float area(int length, int breadth) {
		System.out
				.println(" I received length, breadth  considering it as rectangle and caliculation area of rectangle");
		float area = length * breadth;
		return area;
	}

	public float area(int side) {
		System.out.println("square area ");
		float area = side * side;
		return area;
	}

	public float area(int length, int breadth, int height) {
		System.out.println(
				" I received length, breadth, height considering it as triangle and caliculation area of triangle");
		int area = (length * breadth * height);
		return area;
	}

	public static void main(String[] args) {
		AreaCaliculator obj = new AreaCaliculator();
	  int result  = (int) obj.area(10,15,12);
     System.out.println(result);

	}
	
}
