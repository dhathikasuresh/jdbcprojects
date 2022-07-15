package com.dhathika.threads;

public class TestThread {

	public static void main(String[] args) {
	   TableCaliculator tableCalculator1  = new TableCaliculator(15);
	   TableCaliculator tableCaliculator2 = new TableCaliculator(13);
	   TableCaliculator tableCaliculator3 = new TableCaliculator(19);
	   TableCaliculator tableCaliculator4 = new TableCaliculator(12);
	   
	   MyThread1 thread1 = new MyThread1(tableCalculator1);	   
	   thread1.setName("suresh");
	   MyThread2 thread2 = new MyThread2(tableCaliculator2);
	   thread2.setName("Naresh");
       MyThread1 thread3 = new MyThread1(tableCaliculator3);	
       thread3.setName("Nandini");       
	   MyThread2 thread4 = new MyThread2(tableCaliculator4);
	   thread4.setName("sriman");
	   
	   
	   thread1.start();
	   thread2.start();
	   thread3.start();
	   thread4.start();
	 
	   
	  

	}

}
