package com.dhathika.waitandnotify;

public class App {

	public static void main(String[] args) {
			
		
		 Thread1 t1 = new Thread1();	
		 t1.setName("Seshu");	
		 
		Thread2 t2 = new Thread2();
		  t2.setName("Naresh");	
		  
		  Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				SharedResource.methodThree();
				
			}
		});
		  t3.setName("Nandini");
		  
		  SharedResource src = new SharedResource();
		  
		  Thread t4 = new Thread(new Runnable() {
			  
			  
			@Override
			public void run() {
				
				src.methodFour();
				
			}
		});
		  t4.setName("suresh");
		  Thread t5 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					
					src.methodFour();
					
				}
			});
			  t5.setName("karthik");
	
	   t1.start();
	   t2.start();
	   t3.start();
	   t4.start();
	   t5.start();
	 
	  
    
}
}