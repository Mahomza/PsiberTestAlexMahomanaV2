package com.model;

/**
 * Created on : Oct 10, 2018, 4:12:46 AM Author : Alex@Mahomana.com
 * 
 * @version 1.0.0
 */

public class User {
	private int taxYear;
	private int age;
	private double totalTaxableIncome;
	private String isMonthly;
	private int numOfMedicalAidMember;

	public User() {

	}

	public User(int taxYear, int age, int totalTaxableIncome, String isMonthly, int numOfMedicalAidMember) {
		super();
		this.taxYear = taxYear;
		this.age = age;
		this.totalTaxableIncome = totalTaxableIncome;
		this.isMonthly = isMonthly;
		this.numOfMedicalAidMember = numOfMedicalAidMember;
	}

	public int gettaxYear() {
		return taxYear;
	}

	public void settaxYear(int taxYear) {
		this.taxYear = taxYear;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTotaltaxableIncome() {

		return totalTaxableIncome;
	}

	public void setTotaltaxableIncome(double totalTaxableIncome) {
		this.totalTaxableIncome = totalTaxableIncome;
	}

	public String getIsMothly() {
		return isMonthly;
	}

	public void setIsMothly(String isMonthly) {
		this.isMonthly = isMonthly;
	}

	public int getNumOfMedicalAidMember() {
		return numOfMedicalAidMember;
	}

	public void setNumOfMedicalAidMember(int numOfMedicalAidMember) {
		this.numOfMedicalAidMember = numOfMedicalAidMember;
	}

}
