package com.dhathika.threads;

public class FactorFinder extends Thread{
       int num;
       public FactorFinder(int n) {
    	   num =n;
       }
	@Override
	public void run() {
		for (int i = 1; i <= num; i++) {
			Thread.currentThread();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(num%i==0) {
				System.out.println( i +  " is the factor of " + num);
			}
		}
	}
}
