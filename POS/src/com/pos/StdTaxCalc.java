package com.pos;

public class StdTaxCalc {
	
	public static double getIST(double total) {
		return total*0.1;
		
	}
	public static double getFedTax(double total) {
		return total*0.15;
	}

}
