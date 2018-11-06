package com.runner;

import com.model.User;
import com.model.UserDOA;

/**
 * Created on : Oct 10, 2018, 4:12:46 AM
   Author     : Alex@Mahomana.com
 */

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user = new User();
		
		user.setAge(66);
		user.setMadicalAid(0);
		user.setMothly(true);
		user.setTotaltaxableIncome(360000);
		
		//System.out.println(user.getTotaltaxableIncome());
		
		
		System.out.println(UserDOA.CalculatetaxableIncome(user));
		
		/*
		double monthlytax = 0.0;
		
		System.out.println("***************");
		monthlytax = 360000 - 293600;
		System.out.println(monthlytax);
		
		monthlytax = monthlytax *  0.31;
		System.out.println(monthlytax);
		monthlytax = monthlytax + 61296;
		System.out.println(monthlytax);
		monthlytax = monthlytax - 13500;
		monthlytax = monthlytax - 7407;
		System.out.println(monthlytax);
		monthlytax = monthlytax / 12;
		System.out.println(monthlytax);
		System.out.println("***************");
		*/
		
		
	}

}
