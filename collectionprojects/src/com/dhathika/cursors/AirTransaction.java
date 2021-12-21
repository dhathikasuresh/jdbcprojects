package com.dhathika.cursors;

public interface AirTransaction {
	  int price=0;
    public default void travelPayment() {
    	System.out.println("travel related payment");
    }
}
