package com.dhathika.racecondition;

public class Account {
	int accountNumber;
	double balance;
	
	public Account(int accountNumber , double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void withdraw(double amount) {
		 System.out.println(Thread.currentThread().getName() + " state : " +Thread.currentThread().getState());
		this.balance = this.balance - amount;
		System.out.println("closing balance after withdraw : " +  this.balance);
	}
	public void deposit(double amount) {
       System.out.println(Thread.currentThread().getName() + " state : " +Thread.currentThread().getState());
		this.balance = this.balance + amount;
		System.out.println("closing balance after deposit : " + this.balance);
	}

}
