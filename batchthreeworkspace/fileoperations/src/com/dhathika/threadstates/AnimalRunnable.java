package com.dhathika.threadstates;


public class AnimalRunnable implements Runnable {
	@Override
	public void run() {
		for (int x = 1; x < 4; x++) {
			System.out.println("Run by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Thread State of: "+ Thread.currentThread().getName()+ " - "+Thread.currentThread().getState());
		System.out.println("Exit of Thread: "
				+ Thread.currentThread().getName());
	}
}

