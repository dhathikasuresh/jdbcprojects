package com.dhathika.waitandnotify;

public class Thread1 extends Thread{		
	@Override
	public void run() {
		SharedResource.methodOne();
	}

}
