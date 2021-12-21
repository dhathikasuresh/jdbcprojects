package com.dhathika.cursors;

import java.util.Comparator;

public class PinComparator implements Comparator<Pincode>{

	@Override
	public int compare(Pincode p1, Pincode p2) {
	         if(p1.postalCode<p2.postalCode)
		return -1;
	         else
	        	 return 1;
	}

}
