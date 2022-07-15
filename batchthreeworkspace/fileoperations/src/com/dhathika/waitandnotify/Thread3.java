package com.dhathika.waitandnotify;

public class Thread3 extends Thread {
	
Resource resource;
	
	@Override
	public void run() {
	  resource.resourceMethodStatic1();
	}

}
