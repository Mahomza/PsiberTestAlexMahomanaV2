package com.model;



/**
 * Created on : Oct 10, 2018, 4:12:46 AM
   Author     : Alex@Mahomana.com
 */

public class UserDOA {
	
	
	public static double  CalculatetaxableIncome(User _user)
	{
		double monthlytax = 0.0;
		
		
		if (_user.getAge() < 65)
		{
			if (_user.getTotaltaxableIncome() <= 188000)
			{
				
				monthlytax = _user.getTotaltaxableIncome() *  0.18;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 188001  && _user.getTotaltaxableIncome() <=293600)
			{
				monthlytax = _user.getTotaltaxableIncome() - 188000;
				monthlytax = monthlytax *  0.26;
				monthlytax = monthlytax + 33840;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 293601  && _user.getTotaltaxableIncome() <=406400)
			{
				monthlytax = _user.getTotaltaxableIncome() - 293600;
				
				
				monthlytax = monthlytax + 61296;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 406401  && _user.getTotaltaxableIncome() <=550100)
			{
				monthlytax = _user.getTotaltaxableIncome() - 406400;
				monthlytax = monthlytax *  0.36;
				monthlytax = monthlytax + 96264;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 550101  && _user.getTotaltaxableIncome() <=701300)
			{
				monthlytax = _user.getTotaltaxableIncome() - 550100;
				monthlytax = monthlytax *  0.39;
				monthlytax = monthlytax + 147996;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >=701301)
			{
				monthlytax = _user.getTotaltaxableIncome() - 701300;
				monthlytax = monthlytax *  0.41;
				monthlytax = monthlytax + 206964;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax / 12;
				
			}
			
			
		}
		
		else if(_user.getAge() >= 65  && _user.getAge() <=75)
		{
			if (_user.getTotaltaxableIncome() <= 188000)
			{
				
				monthlytax = _user.getTotaltaxableIncome() *  0.18;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax - 7407;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 188001  && _user.getTotaltaxableIncome() <=293600)
			{
				monthlytax = _user.getTotaltaxableIncome() - 188000;
				monthlytax = monthlytax *  0.26;
				monthlytax = monthlytax + 33840;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax - 7407;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 293601  && _user.getTotaltaxableIncome() <=406400)
			{
				System.out.println("***************");
				monthlytax = _user.getTotaltaxableIncome() - 293600;
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
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 406401  && _user.getTotaltaxableIncome() <=550100)
			{
				monthlytax = _user.getTotaltaxableIncome() - 406400;
				monthlytax = monthlytax *  0.36;
				monthlytax = monthlytax + 96264;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax - 7407;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 550101  && _user.getTotaltaxableIncome() <=701300)
			{
				monthlytax = _user.getTotaltaxableIncome() - 550100;
				monthlytax = monthlytax *  0.39;
				monthlytax = monthlytax + 147996;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax - 7407;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >=701301)
			{
				monthlytax = _user.getTotaltaxableIncome() - 701300;
				monthlytax = monthlytax *  0.41;
				monthlytax = monthlytax + 206964;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax - 7407;
				monthlytax = monthlytax / 12;
				
			}
			
		}
		
		else if(_user.getAge() >75)
		{
			if (_user.getTotaltaxableIncome() <= 188000)
			{
				
				monthlytax = _user.getTotaltaxableIncome() *  0.18;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax - 2466;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 188001  && _user.getTotaltaxableIncome() <=293600)
			{
				monthlytax = _user.getTotaltaxableIncome() - 188000;
				monthlytax = monthlytax *  0.26;
				monthlytax = monthlytax + 33840;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax - 2466;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 293601  && _user.getTotaltaxableIncome() <=406400)
			{
				monthlytax = _user.getTotaltaxableIncome() - 293600;
				monthlytax = monthlytax *  0.31;
				monthlytax = monthlytax + 61296;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax - 2466;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 406401  && _user.getTotaltaxableIncome() <=550100)
			{
				monthlytax = _user.getTotaltaxableIncome() - 406400;
				monthlytax = monthlytax *  0.36;
				monthlytax = monthlytax + 96264;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax - 2466;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >= 550101  && _user.getTotaltaxableIncome() <=701300)
			{
				monthlytax = _user.getTotaltaxableIncome() - 550100;
				monthlytax = monthlytax *  0.39;
				monthlytax = monthlytax + 147996;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax - 2466;
				monthlytax = monthlytax / 12;
				
			}
			
			else if(_user.getTotaltaxableIncome() >=701301)
			{
				monthlytax = _user.getTotaltaxableIncome() - 701300;
				monthlytax = monthlytax *  0.41;
				monthlytax = monthlytax + 206964;
				monthlytax = monthlytax - 13500;
				monthlytax = monthlytax - 2466;
				monthlytax = monthlytax / 12;
				
			}
			
		}
		
		return monthlytax;
	}
	


}
