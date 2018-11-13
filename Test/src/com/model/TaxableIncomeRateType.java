package com.model;

public class TaxableIncomeRateType {
	int minTaxableIncomeValue;
	int maxTaxableIncomeValue;
	double percentageValue;
	int maxTaxRateValue;
	int minTaxRateValue;

	public TaxableIncomeRateType(int minTaxableIncomeValue, int maxTaxableIncomeValue, double percentageValue,
			int maxTaxRateValue, int minTaxRateValue) {
		this.minTaxableIncomeValue = minTaxableIncomeValue;
		this.maxTaxableIncomeValue = maxTaxableIncomeValue;
		this.percentageValue = percentageValue;
		this.maxTaxRateValue = maxTaxRateValue;
		this.minTaxRateValue = minTaxRateValue;
	}

	public int getMinTaxableIncomeValue() {
		return minTaxableIncomeValue;
	}

	public int getMaxTaxableIncomeValue() {
		return maxTaxableIncomeValue;
	}

	public double getPercentageValue() {
		return percentageValue;
	}

	public int getMaxTaxRateValue() {
		return maxTaxRateValue;
	}

	public int getMinTaxRateValue() {
		return minTaxRateValue;
	}

}
