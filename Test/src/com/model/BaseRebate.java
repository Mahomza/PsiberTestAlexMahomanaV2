package com.model;

public abstract class BaseRebate {
	protected int rebateValue;

	public BaseRebate(int rebateValue) {
		this.rebateValue = rebateValue;
	}

	public int getRebateValue() {
		return rebateValue;
	}

	public abstract double calculateTax(int taxYear, double taxableIncome);

	public double processTaxableIncome(int taxYear, double taxableIncome) {
		TaxableIncomeRateType taxIncomeRateType = null;
		boolean isYear2017 = false;
		if (taxYear == 2017) {
			isYear2017 = true;
			if (taxableIncome <= 188000) {
				taxIncomeRateType = new TaxableIncomeRateType(0, 188000, 0.18, 0, 0);
			} else if (taxableIncome >= 188001 && taxableIncome <= 293600) {
				taxIncomeRateType = new TaxableIncomeRateType(188001, 293600, 0.26, 188000, 33840);
			} else if (taxableIncome >= 293601 && taxableIncome <= 406400) {
				taxIncomeRateType = new TaxableIncomeRateType(293601, 406400, 0.31, 293600, 61296);
			} else if (taxableIncome >= 406401 && taxableIncome <= 550100) {
				taxIncomeRateType = new TaxableIncomeRateType(406401, 550100, 0.36, 406400, 96264);
			} else if (taxableIncome >= 550101 && taxableIncome <= 701300) {
				taxIncomeRateType = new TaxableIncomeRateType(550101, 701300, 0.39, 550100, 147996);
			} else {
				taxIncomeRateType = new TaxableIncomeRateType(701301, 0, 0.41, 701300, 206964);
			}
		} else {
			if (taxableIncome <= 189880) {
				taxIncomeRateType = new TaxableIncomeRateType(0, 189880, 0.18, 0, 0);
			} else if (taxableIncome >= 189881 && taxableIncome <= 296540) {
				taxIncomeRateType = new TaxableIncomeRateType(189881, 296540, 0.26, 189880, 34178);
			} else if (taxableIncome >= 296541 && taxableIncome <= 410460) {
				taxIncomeRateType = new TaxableIncomeRateType(296541, 410460, 0.31, 296540, 61910);
			} else if (taxableIncome >= 410461 && taxableIncome <= 555600) {
				taxIncomeRateType = new TaxableIncomeRateType(410461, 555600, 0.36, 410460, 97225);
			} else if (taxableIncome >= 555601 && taxableIncome <= 708310) {
				taxIncomeRateType = new TaxableIncomeRateType(555601, 708310, 0.39, 555600, 149475);
			} else if (taxableIncome >= 708311 && taxableIncome <= 1500000) {
				taxIncomeRateType = new TaxableIncomeRateType(708311, 1500000, 0.41, 708310, 209032);
			} else {
				taxIncomeRateType = new TaxableIncomeRateType(1500001, 0, 0.45, 1500000, 533625);
			}

		}

		double monthlytax = 0.0;

		if (isYear2017) {
			if (taxableIncome > 188000) {
				monthlytax = taxableIncome - taxIncomeRateType.getMaxTaxRateValue();
				monthlytax = monthlytax * taxIncomeRateType.getPercentageValue();
				monthlytax = monthlytax + taxIncomeRateType.getMinTaxRateValue();
			} else {
				monthlytax = taxableIncome * taxIncomeRateType.getPercentageValue();
			}
		} else {
			if (taxableIncome > 189880) {
				monthlytax = taxableIncome - taxIncomeRateType.getMaxTaxRateValue();
				monthlytax = monthlytax * taxIncomeRateType.getPercentageValue();
				monthlytax = monthlytax + taxIncomeRateType.getMinTaxRateValue();
			} else {
				monthlytax = taxableIncome * taxIncomeRateType.getPercentageValue();
			}
		}

		monthlytax = monthlytax - rebateValue;
		monthlytax = monthlytax / 12;

		return monthlytax;
	}

}
