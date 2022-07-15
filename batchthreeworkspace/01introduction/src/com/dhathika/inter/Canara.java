package com.dhathika.inter;

public class Canara implements RBI{
	
	static final String str ="Canara";
	static final  String str1 = "Canara"; 
	final int field = 100;

	@Override
	public double homeLoanInterestCalculator(int principle, int time) {
		System.out.println("canara home loan invoked");
		float interestrate = 8.8f;
		double totalInterest = (principle * time * interestrate)/100;
		return totalInterest;
	}

	@Override
	public double personalLoanInterestCalculator(int principle, int time) {
		System.out.println("canara personal loan invoked");
		float interestrate = 18.8f;
		double totalInterest = (principle * time * interestrate)/100;
		return totalInterest;
	}

	@Override
	public double carLoanInterestCalculator(int principle, int time) {
		System.out.println("canara car loan invoked");
		float interestrate = 11.8f;
		double totalInterest = (principle * time * interestrate)/100;
		return totalInterest;
	}
	
    public void deposit(int amount ) {
    	
    }
    public void withdraw() {
    	
    }

	@Override
	public double countryLoanInterestCalculator() {
		// TODO Auto-generated method stub
		return 0;
	}

}
