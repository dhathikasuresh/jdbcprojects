package com.dhathika.cursors;

public interface RBI {
	
	int principle=0;
	int time=0;
	float rate=0;
	
	public abstract double interestCalculator(int principle, int timeInMonths, float rate);
    public abstract double totalSumCalcultor(int principal, double interest);
}
