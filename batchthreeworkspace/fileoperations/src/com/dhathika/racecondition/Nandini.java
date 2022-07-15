package com.dhathika.racecondition;

public class Nandini extends Thread {
	
	Account account;
	public Nandini(Account account) {
		this.account = account;
	}	
	@Override
	public void run() {
		 System.out.println(Thread.currentThread().getName() + " state just enters into run" +Thread.currentThread().getState());
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
				 System.out.println(Thread.currentThread().getName() + " state after sleep" +Thread.currentThread().getState());
	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(Thread.currentThread().getName() + " state before deposit" +Thread.currentThread().getState());
			account.deposit(50);
			 System.out.println(Thread.currentThread().getName() + " state after deposit" +Thread.currentThread().getState());
		}
		 System.out.println(Thread.currentThread().getName() + " state after thread job" +Thread.currentThread().getState());
			
	}

}
