package com.dhathika.waitandnotify;

public class Thread2 extends Thread{
	
	
	@Override
	public void run() {
		SharedResource.methodTwo();
	}

}
