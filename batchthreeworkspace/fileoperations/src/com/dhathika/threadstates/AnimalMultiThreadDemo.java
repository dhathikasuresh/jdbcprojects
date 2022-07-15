package com.dhathika.threadstates;

public class AnimalMultiThreadDemo {
	public static void main(String[] args) throws Exception{
		// Make object of  Runnable
		AnimalRunnable anr = new AnimalRunnable();
		Thread cat = new Thread(anr);
		cat.setName("Cat");
		Thread dog = new Thread(anr);
		dog.setName("Dog");
		Thread cow = new Thread(anr);
		cow.setName("Cow");
		System.out.println("Thread State of Cat before calling start: "+cat.getState());
		cat.start();
		dog.start();
		cow.start();
		System.out.println("Thread State of Cat in Main method before Sleep: " + cat.getState());
		System.out.println("Thread State of Dog in Main method before Sleep: " + dog.getState());
		System.out.println("Thread State of Cow in Main method before Sleep: " + cow.getState());
		Thread.sleep(10000);
		System.out.println("Thread State of Cat in Main method after sleep: " + cat.getState());
		System.out.println("Thread State of Dog in Main method after sleep: " + dog.getState());
		System.out.println("Thread State of Cow in Main method after sleep: " + cow.getState());		
	}
}



