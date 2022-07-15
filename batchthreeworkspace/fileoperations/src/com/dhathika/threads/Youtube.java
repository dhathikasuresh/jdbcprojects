package com.dhathika.threads;

public class Youtube extends Thread {
	String status;

	public Youtube(String status) {
		this.status = status;
	}

	@Override
	public void run() {
		
          for (int i = 0; i < 20; i++) {
        	  try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	  System.out.println("Now " + status + ".....");
		}
		

	}

}
