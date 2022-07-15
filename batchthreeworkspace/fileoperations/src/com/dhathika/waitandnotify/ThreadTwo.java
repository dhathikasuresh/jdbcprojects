package com.dhathika.waitandnotify;

public class ThreadTwo extends Thread {
	Processor processor;

	public ThreadTwo(Processor processor) {
		this.processor = processor;
	}

	@Override
	public void run() {
		
			try {
				processor.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	

}
