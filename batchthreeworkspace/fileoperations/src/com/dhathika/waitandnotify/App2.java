package com.dhathika.waitandnotify;

public class App2 {

	public static void main(String[] args) throws InterruptedException {
		Processor processor = new Processor();
		ThreadOne t1 = new ThreadOne(processor);
		ThreadTwo t2 = new ThreadTwo(processor);
		t1.start();
		t2.start();
		t1.join();
		t2.join();

	}

}
