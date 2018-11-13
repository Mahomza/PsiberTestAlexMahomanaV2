/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.view;

/**
 * Created on : Oct 10, 2018, 4:12:46 AM
   Author     : Alex@Mahomana.com
 */

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class taxCalculatorForm extends org.apache.struts.action.ActionForm {

	private static final long serialVersionUID = 6950258278665366513L;
	private int taxYear;
	private int age;
	private int totaltaxableIncome;
	private int numofMedicalAidMember;
	private String isMonthly;
	private String monthlyPAYE;
	private String annualPAYE;
	private String taxCredits;
	private String duePAYE;
	private String netCash;

	public taxCalculatorForm() {
		super();
		isMonthly = "false";
		// TODO Auto-generated constructor stub
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		boolean isNumeric = false;

		isNumeric = String.valueOf(numofMedicalAidMember).chars().allMatch(Character::isDigit);
		if (!isNumeric) {
			errors.add("numofMedicalAidMember", new ActionMessage("error.numOfMedicalAidMember.integer"));
			// TODO: add 'error.name.required' key to your resources
		}
		if (numofMedicalAidMember < 0) {
			errors.add("numofMedicalAidMember", new ActionMessage("error.numOfMedicalAidMember.integer"));
			// TODO: add 'error.name.required' key to your resources
		}

		if (age < 1) {
			errors.add("age", new ActionMessage("error.age.integer"));
			// TODO: add 'error.name.required' key to your resources
		}
		isNumeric = String.valueOf(age).chars().allMatch(Character::isDigit);
		if (!isNumeric) {
			errors.add("age", new ActionMessage("error.age.integer"));
			// TODO: add 'error.name.required' key to your resources
		}

		isNumeric = String.valueOf(taxYear).chars().allMatch(Character::isDigit);
		if (!isNumeric) {
			errors.add("taxYear", new ActionMessage("error.taxYear.integer"));
			// TODO: add 'error.name.required' key to your resources
		}

		if (taxYear < 1) {
			errors.add("taxYear", new ActionMessage("error.taxYear.integer"));
			// TODO: add 'error.name.required' key to your resources
		}

		isNumeric = String.valueOf(totaltaxableIncome).chars().allMatch(Character::isDigit);
		if (!isNumeric) {
			errors.add("totaltaxableIncome", new ActionMessage("errors.double"));
			// TODO: add 'error.name.required' key to your resources
		}

		if (totaltaxableIncome < 1) {
			errors.add("totaltaxableIncome", new ActionMessage("errors.double"));
			// TODO: add 'error.name.required' key to your resources
		}

		return errors;
	}

	public String getIsMonthly() {
		return isMonthly;
	}

	public void setIsMonthly(String isMonthly) {
		this.isMonthly = isMonthly;
	}

	public int getTotaltaxableIncome() {
		return totaltaxableIncome;
	}

	public void setTotaltaxableIncome(int totaltaxableIncome) {
		this.totaltaxableIncome = totaltaxableIncome;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int gettaxYear() {
		return taxYear;
	}

	public void settaxYear(int taxYear) {
		this.taxYear = taxYear;
	}

	public int getNumofMedicalAidMember() {
		return numofMedicalAidMember;
	}

	public void setNumofMedicalAidMember(int numofMedicalAidMember) {
		this.numofMedicalAidMember = numofMedicalAidMember;
	}

	public String getMonthlyPAYE() {
		return monthlyPAYE;
	}

	public void setMonthlyPAYE(String monthlyPAYE) {
		this.monthlyPAYE = monthlyPAYE;
	}

	public String getAnnualPAYE() {
		return annualPAYE;
	}

	public void setAnnualPAYE(String annualPAYE) {
		this.annualPAYE = annualPAYE;
	}

	public String getTaxCredits() {
		return taxCredits;
	}

	public void setTaxCredits(String taxCredits) {
		this.taxCredits = taxCredits;
	}

	public String getDuePAYE() {
		return duePAYE;
	}

	public void setDuePAYE(String duePAYE) {
		this.duePAYE = duePAYE;
	}

	public String getNetCash() {
		return netCash;
	}

	public void setNetCash(String netCash) {
		this.netCash = netCash;
	}

}
