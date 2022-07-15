package com.dhathika.inter;

@FunctionalInterface
public interface Mobikwik {
	float pi = 3.14f;
	float gravity = 0.98f;
	 void recharge(int amount);
	 default void recharge() {
		 
		 
	 }
	 
	 default void forceCalculator(int mass) {
		 float force = mass *gravity;
				 
	 }
	 
	 default float cicleAreaCalculator(int radius) {
		 float area = pi * radius * radius;
		 return area;
	 }

	

}
