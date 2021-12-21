package com.dhathika.cursors;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class Client {

	public static void main(String[] args) {	

	Pincode pin1 = new Pincode(105060);
	Pincode pin2 = new Pincode(105070);
	Pincode pin3 = new Pincode(105080);
	Pincode pin4 = new Pincode(105090);
	Pincode pin5 = new Pincode(105090);
	Pincode pin6 = new Pincode(105091);
	Pincode pin7 = new Pincode(105092);
	
	PostalAddress pa1 = new PostalAddress("BMukku", "Aryanadu", "TVM","Kerala", "India");
	PostalAddress pa2 = new PostalAddress("Nedumangadu", "Nedumangadu", "TVM","Kerala", "India");
	PostalAddress pa3 =  new PostalAddress("Cheenivila", "Kattakkada", "TVM","Kerala", "India");
	PostalAddress pa4 = new PostalAddress("Vepalapalli", "Tanakal", "TVM","Kerala", "India");
	PostalAddress pa5 = new PostalAddress("kadiri", "Tanakal", "TVM","Kerala", "India");
	
	Map<Pincode,PostalAddress> postalMap = new HashMap<>();
		
   postalMap.put(pin1, null);
   postalMap.put(pin2, null);
   postalMap.put(pin3, null);
   postalMap.put(pin4, null);
   postalMap.put(pin5, pa5);
   postalMap.put(pin6, null);
   postalMap.put(pin7, null);
 
   
   Iterator itr = postalMap.keySet().iterator();
// fail fast iterator since its created on a hashmap which fails when another object modifies the definition of collection object.
   while(itr.hasNext()) {
	   System.out.println(postalMap.get(itr.next()));
	  postalMap.get(itr.next());
	 
	 
   }
  
   System.out.println(postalMap.size());
   
   Iterator itr1 = postalMap.keySet().iterator();
   while(itr1.hasNext()) {
	   System.out.println(postalMap.get(itr1.next()) );
   }
   System.out.println(postalMap);
   //postalMap.put(new Pincode(515574), new PostalAddress("LBNagar", "Korlagunta", "Chittoor", "AP", "India"));
   
   
   
   List<String> list = new CopyOnWriteArrayList<String>();
   list.add("Bangalore");
   list.add("Hyderabad");
   list.add("Chennai");
   list.add("Trivandrum");
   list.add("Amaravati");
   
   Iterator itrs = list.iterator();
   while(itrs.hasNext()) {
	   System.out.println(itrs.next());
	   list.add("Patna");
   }
   
   Iterator itrss = list.iterator();
   while(itrss.hasNext()) {
	   System.out.println(itrss.next());
	 
   }
   
   Hashtable<Integer, String> table = new Hashtable<>();
   table.put(10, "Ten");
   
   
   
   
   
   

	}
	
	
}
