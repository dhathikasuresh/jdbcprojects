package com.dhathika.waitandnotify;

public class ThreadOne extends Thread{
	Processor processor;
	public ThreadOne(Processor processor) {
	   this.processor = processor;
	}
	@Override
	public void run() {
		
		
				try {
					processor.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
}
