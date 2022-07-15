package com.dhathika.waitandnotify;

import java.util.Scanner;

public class Processor {
	
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() +  " is in produce()");
			System.out.println("Producer thread is running ");
			wait(500);
			System.out.println("Resumed");
		}
	}
	public void consume() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Thread.sleep(2000);
		synchronized (this) {
			System.out.println(Thread.currentThread().getName() +  " is in consume()");
			System.out.println("Waiting for a return key");
			sc.nextLine();
			System.out.println("Return key pressed");
			notify();
			Thread.sleep(5000);			
		}
	}

}
