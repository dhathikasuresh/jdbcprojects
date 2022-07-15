package com.dhathika.hashmaps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a key/pin");
		int pin =  sc.nextInt();
		System.out.println("key is " + pin);		
		Address nareshaddress = new Address(sc.next(), sc.next(), sc.next(), sc.next(), sc.next());		
		System.out.println(nareshaddress);
		HashMap map = new HashMap<Integer, Address>();
		map.put(pin, nareshaddress);
		
		ConcurrentMap map1 = new ConcurrentHashMap<String, City>();
		map1.put("bangalore", new City("bangalore", "karnataka", "indian", 560036));
		System.out.println("bangalore".hashCode());

	}

}
