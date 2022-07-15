package com.dhathika.waitandnotify;

public class Resource {
	
 public static synchronized void resourceMethodStatic() {
	 
	 for (int i = 0; i < 20; i++) {
		 
		 try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.println("Current thread is " + Thread.currentThread().getName());
	}
 }
	 public void resourceMethodNonStatic() {
		 
		 for (int i = 0; i < 20; i++) {
			 
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 System.out.println("Current thread is " + Thread.currentThread().getName());
		}
	}
	 public static synchronized void resourceMethodStatic1() {
		 
		 for (int i = 0; i < 20; i++) {
			 
			 try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			 System.out.println("Current thread is " + Thread.currentThread().getName());
		}
	 
	 }
}
