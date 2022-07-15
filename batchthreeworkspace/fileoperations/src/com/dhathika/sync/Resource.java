package com.dhathika.sync;

public class Resource {	
	
	public synchronized void resourceMethod() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println( i + " Currently " + this + " object is used by " + Thread.currentThread().getName() +  " is using");
		}
	}

}
