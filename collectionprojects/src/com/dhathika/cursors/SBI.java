package com.dhathika.cursors;

public class SBI implements RBI {
	
	int principle;
	int timeInMonths;
	float interestRate;
	

	public SBI(int principle, int timeInMonths, float interestRate) {
		super();
		this.principle = principle;
		this.timeInMonths = timeInMonths;
		this.interestRate = interestRate;
	}

	@Override
	public double interestCalculator(int principle, int timeInMonths, float rate) {
		double result = (principle * timeInMonths * rate)/100;
		return result;
	}

	@Override
	public double totalSumCalcultor(int principle, double interest) {
		double result = principle + interest;
		return result;
	}
	
}
