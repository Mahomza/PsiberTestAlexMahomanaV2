/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vaannila;

/**
 * Created on : Oct 10, 2018, 4:12:46 AM
   Author     : Alex@Mahomana.com
 */

import java.text.DecimalFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.model.User;
import com.model.UserDOA;

import org.apache.struts.action.ActionForward;

public class taxCalculatorAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private final static String SUCCESS = "success";
    private final static String FAILURE = "failure";
    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        taxCalculatorForm tForm = (taxCalculatorForm) form;
        if (tForm.getAge()>0) {
        	User user = new User();
    		
    		user.setAge(tForm.getAge());
    		user.setMadicalAid(tForm.getMadicalAid());
    		user.setMothly(Boolean.valueOf( tForm.isMothly()));
    		user.setTotaltaxableIncome(tForm.getTotaltaxableIncome());
    		
    		//System.out.println(user.getTotaltaxableIncome());
    		DecimalFormat df = new DecimalFormat("R####0.00");
    		tForm.setTotalTax(df.format(UserDOA.CalculatetaxableIncome(user)));
    		
    		System.out.println();
    		
        	
            return mapping.findForward(SUCCESS);
        } else {
            return mapping.findForward(FAILURE);
        }
    }
}
