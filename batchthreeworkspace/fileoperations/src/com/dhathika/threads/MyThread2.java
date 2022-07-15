package com.dhathika.threads;

public class MyThread2 extends Thread{

TableCaliculator tableCaliculator;
	
	public MyThread2(TableCaliculator table) {
		tableCaliculator = table;
	}
	
	@Override
	public void run() {
		tableCaliculator.table();		
	}

}
