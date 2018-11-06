/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vaannila;

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
	private double totaltaxableIncome;
	private String isMothly;
	private double madicalAid;
	private String totalTax;

    public taxCalculatorForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        if (age < 1) {
            errors.add("age", new ActionMessage("error.age.integer"));
            // TODO: add 'error.name.required' key to your resources
        }
        
        if (taxYear < 1) {
            errors.add("taxYear", new ActionMessage("error.taxYear.integer"));
            // TODO: add 'error.name.required' key to your resources
        }
        
        if (totaltaxableIncome < 1) {
            errors.add("totaltaxableIncome", new ActionMessage("error.totaltaxableIncome.double"));
            // TODO: add 'error.name.required' key to your resources
        }
        
        if (totaltaxableIncome < 1) {
            errors.add("totaltaxableIncome", new ActionMessage("error.totaltaxableIncome.double"));
            // TODO: add 'error.name.required' key to your resources
        }
        
        
        if (madicalAid < 0) {
            errors.add("madicalAid", new ActionMessage("error.madicalAid.double"));
            // TODO: add 'error.name.required' key to your resources
        }
        
        return errors;
    }


	public String isMothly() {
		return isMothly;
	}

	public void setMothly(String isMothly) {
		this.isMothly = isMothly;
	}

	public double getTotaltaxableIncome() {
		return totaltaxableIncome;
	}

	public void setTotaltaxableIncome(double totaltaxableIncome) {
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

	public double getMadicalAid() {
		return madicalAid;
	}

	public void setMadicalAid(double madicalAid) {
		this.madicalAid = madicalAid;
	}

	public String getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(String totalTax) {
		this.totalTax = totalTax;
	}
}
