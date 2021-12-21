package com.dhathika.cursors;

public class ICICI implements RBI {

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
