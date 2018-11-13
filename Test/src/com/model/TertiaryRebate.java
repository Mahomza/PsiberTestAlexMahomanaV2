package com.model;

public class TertiaryRebate extends BaseRebate {

	public TertiaryRebate(int rebateValue) {
		super(rebateValue);
		// TODO Auto-generated constructor stub
	}

	public static boolean isValidAge(int age) {

		if (age > 75) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public double calculateTax(int taxYear, double taxableIncome) {
		// TODO Auto-generated method stub
		return processTaxableIncome(taxYear,taxableIncome);
	}


}
