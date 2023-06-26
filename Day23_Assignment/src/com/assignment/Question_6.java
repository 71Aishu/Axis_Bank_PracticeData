package com.assignment;

public class Question_6 
{
   
	public static void main(String[] args)
	{
		Bank b = new Bank();
		SBI sbi = new SBI();
		ICICI ic = new ICICI();
		Axis a = new Axis();
		
		System.out.println("Rate of Interest in Bank : " + b.getRateOfInterest());
		System.out.println("Rate of Interest in SBI Bank : " + sbi.getRateOfInterest());
		System.out.println("Rate of Interest in ICICI Bank : " + ic.getRateOfInterest());
		System.out.println("Rate of Interest in Axis Bank : " + a.getRateOfInterest());
	}

}
