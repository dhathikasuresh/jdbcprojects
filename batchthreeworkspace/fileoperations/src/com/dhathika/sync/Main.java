package com.dhathika.sync;

public class Main {

	public static void main(String[] args) {
		Resource r1 = new Resource();
		
	 Thread1 t1 =  new Thread1(r1);
	 Thread1 t2 = new Thread1(r1);
	 Thread1 t3 = new Thread1(r1);
	 Thread1 t4 = new Thread1(r1);
	 Thread1 t5 = new Thread1(r1);
	 t1.setName("Naresh");	 
	 t2.setName("Sriman");
	 t3.setName("Manoj");
	 t4.setName("Karthik");
	 t5.setName("Venkatesh");
	 t1.start();
	 try {
		t1.join(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 t2.start();
	 try {
		t2.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 t3.start();
	 t4.start();
	 t5.start();
		
		
		
		 
		 

	}

}
