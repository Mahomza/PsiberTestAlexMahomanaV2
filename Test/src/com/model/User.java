package com.model;

/**
 * Created on : Oct 10, 2018, 4:12:46 AM
   Author     : Alex@Mahomana.com
   @version 1.0.0
 */



public class User 
{
	private int taxYear;
	private int age;
	private double totaltaxableIncome;
	private boolean isMothly;
	private double madicalAid;
	
	
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
		
		if (this.isMothly == true)
		{
			this.totaltaxableIncome = this.totaltaxableIncome * 12;
			
		}
		return totaltaxableIncome;
	}
	public void setTotaltaxableIncome(double totaltaxableIncome) {
		this.totaltaxableIncome = totaltaxableIncome;
	}
	public boolean isMothly() {
		return isMothly;
	}
	public void setMothly(boolean isMothly) {
		this.isMothly = isMothly;
	}
	public double getMadicalAid() {
		return madicalAid;
	}
	public void setMadicalAid(double madicalAid) {
		this.madicalAid = madicalAid;
	}
	
	

}
