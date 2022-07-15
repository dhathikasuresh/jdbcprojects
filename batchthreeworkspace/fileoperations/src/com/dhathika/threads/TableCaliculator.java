package com.dhathika.threads;

public class TableCaliculator {
	
	int number;
	public TableCaliculator(int num) {
		this.number = num;
	}

	public void table() {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(number + " X " + i + " = " +number * i);
		}

	}

}
