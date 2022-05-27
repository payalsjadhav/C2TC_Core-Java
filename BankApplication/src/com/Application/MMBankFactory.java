package com.Application;

import com.Framework.CurrentAcc;

public class MMBankFactory extends CurrentAcc
{
	public MMBankFactory() {}

	public MMBankFactory(int accNo, String accNm, float accBal, float creditLimit) 
	{
		super(accNo, accNm, accBal, creditLimit);
	}
	
	@Override
	public void withdraw(float accBal)
	{
		System.out.println("Dear Customer : \n Your Current Account Balance are: "+accBal+"\n        And Credit limit  is: "+creditLimit);
		System.out.println("		    Total Amount : " +(accBal+creditLimit));
	}

	@Override
	public String toString()
	{
		return super.toString()+"MMCurrentAcc []";
	}
}
