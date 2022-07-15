package com.dhathika.waitandnotify;

public class SharedResource {
	
	public static synchronized void methodOne() {
		for (int i = 0; i < 10; i++) {
			
		
		System.out.println(Thread.currentThread().getName()  + " is using this method 1");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
	}
	public static synchronized void methodTwo() {
		for (int i = 0; i < 10; i++) {			
		
		System.out.println(Thread.currentThread().getName()  + " is using this method 2");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	}
	public static  synchronized void methodThree() {
		for (int i = 0; i < 10; i++) {
			
		
		System.out.println(Thread.currentThread().getName()  + " is using this method 3");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
	}
	public synchronized void methodFour() {
		for (int i = 0; i < 10; i++) {
			
		methodThree();
		System.out.println(Thread.currentThread().getName()  + " is using this method 4");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		}
	}
}
