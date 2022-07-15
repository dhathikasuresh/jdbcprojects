package com.dhathika.inter;

public class SBI implements RBI{

	@Override
	public double homeLoanInterestCalculator(int principle, int time) {
		System.out.println("sbi home loan invoked");
		float interestrate = 6.8f;
		double totalInterest = (principle * time * interestrate)/100;
		return totalInterest;
	
	}

	@Override
	public double personalLoanInterestCalculator(int principle, int time) {
		System.out.println("sbi personal loan invoked");
		float interestrate = 14.8f;
		double totalInterest = (principle * time * interestrate)/100;
		return totalInterest;
		
	}

	@Override
	public double carLoanInterestCalculator(int principle, int time) {
		System.out.println("sbi car loan invoked");
		float interestrate = 9.8f;
		double totalInterest = (principle * time * interestrate)/100;
		return totalInterest;
	
	}

	@Override
	public double countryLoanInterestCalculator() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
	
	
	
//	public double homeLoanInterestCalculator(int principle, int time) {
		
//		
//	}

}
