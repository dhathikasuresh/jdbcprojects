package com.dhathika.racecondition;

public class Vipina extends Thread{

	Account account;
	public Vipina(Account account) {
		this.account = account;
	}	
	@Override
	public void run() {
		 System.out.println(Thread.currentThread().getName() + " state entered into run" +Thread.currentThread().getState());
		for (int i = 0; i < 20; i++) {
			try {
				 System.out.println(Thread.currentThread().getName() + " state before sleep" +Thread.currentThread().getState());
				Thread.sleep(1000);
				 System.out.println(Thread.currentThread().getName() + " state after sleep" +Thread.currentThread().getState());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(Thread.currentThread().getName() + " state before withdraw" +Thread.currentThread().getState());
			account.withdraw(50);
			 System.out.println(Thread.currentThread().getName() + " state after withdraw " +Thread.currentThread().getState());
		}
		 System.out.println(Thread.currentThread().getName() + " state after thread job" +Thread.currentThread().getState());
	}
}
