package com.Framework;

import com.framework.ShopAcc;

public class PrimeAcc extends ShopAcc
{
	private boolean isPrime;
	private static final float derivarycharges = 0.00f;
	
	public PrimeAcc()
	{
		
	}
	public PrimeAcc(int accNO,String accName,float charges,boolean isPrime)
	{
		super();
		this.isPrime = isPrime;
		
	}
	
	public boolean isPrime()
	{
		return isPrime;
	}
	
	public void setPrime(boolean isPrime)
	{
		this.isPrime = isPrime;
	}
	
	public static float getDerivarycharges()
	{
		return derivarycharges;
	}
	public void bookProduct(float charg)
	{
	
	}
	public String toString()
	{
		return super.toString()+"PrimeAcc[isPrime="+isPrime+"]";
	}

}
