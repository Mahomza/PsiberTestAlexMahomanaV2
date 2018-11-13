package com.service;

import com.model.BaseRebate;
import com.model.RebateType;
import com.util.RebateUtil;

public class RebateService {

	public double calculateTax(int age, int taxYear, double taxableIncome, RebateType rebateType) {
		RebateUtil rebateUtil = new RebateUtil(rebateType);
		BaseRebate rebate = rebateUtil.getRebateType(age);
		double taxResults = rebate.calculateTax(taxYear, taxableIncome);
		return taxResults;
	}

}
