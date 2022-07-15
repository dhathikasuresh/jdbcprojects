package com.dhathika.inter;

public class LoanBroker {

	public static void main(String[] args) {
		
//		SBI sbi = new SBI();
//		System.out.println("sbi interest " + sbi.homeLoanInterestCalculator(1000000, 15));
//		ICICI icici = new ICICI();
//		System.out.println("ICICI interest " + icici.homeLoanInterestCalculator(1000000, 15));
//		Canara canara = new Canara();
//		System.out.println("Canara interest " + canara.homeLoanInterestCalculator(1000000, 15));
		
		
		RBI rbi = new Canara();
		System.out.println(rbi.personalLoanInterestCalculator(10000000, 10));
		
		rbi = new ICICI();
		rbi.personalLoanInterestCalculator(10000000, 10);
		
		rbi = new SBI();
		rbi.personalLoanInterestCalculator(10000000, 10);
		
	}

}
