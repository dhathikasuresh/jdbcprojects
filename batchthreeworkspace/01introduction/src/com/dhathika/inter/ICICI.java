package com.dhathika.inter;

public class ICICI implements RBI{

	@Override
	public double homeLoanInterestCalculator(int principle, int time) {
		System.out.println("icici home loan invoked");
		float interestrate = 7.2f;
		double totalInterest = (principle * time * interestrate)/100;
		return totalInterest;
	}

	@Override
	public double personalLoanInterestCalculator(int principle, int time) {
		System.out.println("icici personal loan invoked");
		float interestrate = 15.8f;
		double totalInterest = (principle * time * interestrate)/100;
		return totalInterest;
	}

	@Override
	public double carLoanInterestCalculator(int principle, int time) {
		System.out.println("icici car loan invoked");
		float interestrate = 10.8f;
		double totalInterest = (principle * time * interestrate)/100;
		return totalInterest;
	}

	@Override
	public double countryLoanInterestCalculator() {
		// TODO Auto-generated method stub
		return 0;
	}





	



}
