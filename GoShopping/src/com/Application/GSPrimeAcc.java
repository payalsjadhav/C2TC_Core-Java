package com.Application;

import com.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc 
{
private static final float charge = 200.25f;
	
	public GSPrimeAcc()
	{
		
	}
	public GSPrimeAcc(int accNO,String accName,float charges,boolean isPrime)
	{
		super(accNO,accName,charges,isPrime);
	}
	
	public void bookProduct(float charg)
	{
		
	}
	@Override
	public String toString()
	{
		return super.getAccNO()+super.getAccName()+super.getCharges()+super.isPrime();
	}
	
	}
