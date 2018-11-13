package com.model;

public class SecondaryRebate extends BaseRebate {

	public SecondaryRebate(int rebateValue) {
		super(rebateValue);
		// TODO Auto-generated constructor stub
	}

	public static boolean isValidAge(int age) {

		if (age >= 65 && age <= 75) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public double calculateTax(int taxYear, double taxableIncome) {
		// TODO Auto-generated method stub
		return processTaxableIncome(taxYear, taxableIncome);
	}

}
