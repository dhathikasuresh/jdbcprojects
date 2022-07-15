package com.dhathika.threads;

public class MyThread1 extends Thread {

	TableCaliculator tableCaliculator;
	
	public MyThread1(TableCaliculator table) {
		tableCaliculator = table;
	}
	
	@Override
	public void run() {
	
		tableCaliculator.table();		
	}

}
