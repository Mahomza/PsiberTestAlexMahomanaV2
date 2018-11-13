package com.model;

public class PrimaryRebate extends BaseRebate {

	public PrimaryRebate(int rebateValue) {
		super(rebateValue);
		// TODO Auto-generated constructor stub
	}

	public static boolean isValidAge(int age) {

		if (age < 65) {
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
