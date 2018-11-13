/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import java.text.DecimalFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.model.MedicalCredit;
import com.model.RebateType;
import com.model.User;
import com.service.RebateService;

public class taxCalculatorAction extends org.apache.struts.action.Action {

	/* forward name="success" path="" */
	private static final String TAX_DECIMAL_FORMAT = "R####0.00";
	private final static String SUCCESS = "success";
	private final static String FAILURE = "failure";
	RebateType rebateType2018 = new RebateType(13635, 7479, 2493);
	RebateType rebateType2017 = new RebateType(13500, 7407, 4466);
	MedicalCredit medicalCredit2018 = new MedicalCredit(303, 303, 204);
	MedicalCredit medicalCredit2017 = new MedicalCredit(286, 286, 192);

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		DecimalFormat df = new DecimalFormat(TAX_DECIMAL_FORMAT);
		double annualPAYE = 0.0;
		double monthlyPAYE = 0.0;
		double duePAYE = 0.0;
		double netCash = 0.0;
		double taxCredit = 0.0;
		taxCalculatorForm tForm = (taxCalculatorForm) form;
		if (tForm.getAge() > 0) {
			// TODO Validation
			double totaltaxableIncome = 0;
			User user = new User();
			user.setAge(tForm.getAge());
			user.setNumOfMedicalAidMember(tForm.getNumofMedicalAidMember());
			user.setIsMothly(String.valueOf(tForm.getIsMonthly()));
			user.setTotaltaxableIncome(tForm.getTotaltaxableIncome());
			user.settaxYear(tForm.gettaxYear());
			RebateService rebateService = new RebateService();
			if (user.getIsMothly().equalsIgnoreCase("on")) {
				totaltaxableIncome = user.getTotaltaxableIncome() * 12;
			} else {
				totaltaxableIncome = user.getTotaltaxableIncome();
			}
			if (user.gettaxYear() == 2018) {
				monthlyPAYE = rebateService.calculateTax(user.getAge(), user.gettaxYear(), totaltaxableIncome,
						rebateType2018);
				annualPAYE = monthlyPAYE * 12;
				taxCredit = medicalCredit2018.CalculateTaxCredit(user.getNumOfMedicalAidMember());
				tForm.setTaxCredits(String.valueOf(taxCredit));
			} else {
				monthlyPAYE = rebateService.calculateTax(user.getAge(), user.gettaxYear(), totaltaxableIncome,
						rebateType2017);
				annualPAYE = monthlyPAYE * 12;
				taxCredit = medicalCredit2017.CalculateTaxCredit(user.getNumOfMedicalAidMember());
			}
			duePAYE = monthlyPAYE - taxCredit;
			netCash = (totaltaxableIncome / 12) - duePAYE;
			tForm.setMonthlyPAYE(String.valueOf(df.format(monthlyPAYE)));
			tForm.setAnnualPAYE(String.valueOf(df.format(annualPAYE)));
			tForm.setTaxCredits(String.valueOf(df.format(taxCredit)));
			tForm.setDuePAYE(String.valueOf(df.format(duePAYE)));
			tForm.setNetCash(String.valueOf(df.format(netCash)));
			return mapping.findForward(SUCCESS);
		} else {
			return mapping.findForward(FAILURE);
		}
	}
}
