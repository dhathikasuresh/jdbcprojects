package com.dhathika.sync;

public class Thread1  extends Thread{
	
	Resource resource;
	int k = 5;
	String s = "suresh";
	
	public Thread1(Resource resource) {
		this.resource=  resource;
	}
	
	@Override
	public void run() {
	    resource.resourceMethod();
	}

}
