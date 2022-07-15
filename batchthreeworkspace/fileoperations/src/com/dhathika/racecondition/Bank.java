package com.dhathika.racecondition;

public class Bank {

	public static void main(String[] args) {
	  Account account = new Account(101, 1000);
	  
	  
	  Nandini nandini = new Nandini(account);
	  System.out.println(nandini.getName() + " state after thread job" +nandini.getState());
		
	  Vipina vipina = new Vipina(account);	
	  System.out.println(vipina.getName() + " state after thread job" +nandini.getState());
		

	  nandini.setName("Nandini");
	  vipina.setName("Vipina");
	  vipina.start(); // 950
	  System.out.println(vipina.getName() + " state after thread job" +vipina.currentThread().getState());
	  try {
		vipina.join();
		System.out.println(nandini.getName() + " state after thread job" +vipina.currentThread().getState());
		

	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	  nandini.start();// 1200	 
	  System.out.println(nandini.getName() + " state after thread job" +vipina.currentThread().getState());
		
	  
	}

}
