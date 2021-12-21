package com.dhathika.cursors;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {


		Pincode pin1 = new Pincode(105060);
		Pincode pin2 = new Pincode(105050);
		Pincode pin3 = new Pincode(105080);
		Pincode pin4 = new Pincode(105070);
		Pincode pin5 = new Pincode(105100);
		Pincode pin6 = new Pincode(105091);
		Pincode pin7 = new Pincode(105092);
		
		ArrayList<Pincode> list = new ArrayList<>();
		
		list.add(pin1);
		list.add(pin2);
		list.add(pin3);
		list.add(pin4);
		list.add(pin5);
		list.add(pin6);
		list.add(pin7);
		
		for(Pincode pin : list) {
			System.out.println(pin);
		}
		
		System.out.println("******************");
		list.sort(new PinComparator());
		
		for(Pincode pin : list) {
			System.out.println(pin);
		}
	}

}
