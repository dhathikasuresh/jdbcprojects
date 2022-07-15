package com.dhathika.inter;

public interface RBI extends WorldBank{
	
	 final int filed1 = 100;
	final int filed2 = 200;
	
	
	
	  default double homeLoanInterestCalculator(int principle, int time) {
		  return 0;
	  }
	  double personalLoanInterestCalculator(int principle, int time);
	  double carLoanInterestCalculator(int principle, int time);


}
