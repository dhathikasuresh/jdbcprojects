package com.dhathika.threads;

public class Main {

	public static void main(String[] args) {
		
		FactorFinder f1 = new FactorFinder(36);
		FactorFinder f2 = new FactorFinder(18);
		FactorFinder f3 = new FactorFinder(96);
		FactorFinder f4 = new FactorFinder(54);
		FactorFinder f5 = new FactorFinder(1080);
		FactorFinder f6 = new FactorFinder(2024);
		FactorFinder f7 = new FactorFinder(163);
		FactorFinder f8 = new FactorFinder(195);
		FactorFinder f9 = new FactorFinder(236);
		FactorFinder f10 = new FactorFinder(456);
		
		f1.start();
		try {
		f1.start();
		}
		catch(IllegalThreadStateException e) {
			System.out.println("hsould not start a thread twice");
		}
	
		
		System.out.println(Thread.activeCount());
		
	
	
	}

}
