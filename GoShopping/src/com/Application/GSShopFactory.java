package com.Application;

import com.framework.ShopFactory;

public class GSShopFactory implements ShopFactory 
{
	@Override
	public GSPrimeAcc getNewPrimeAccount(int accNO,String accName,float charges,boolean isPrime)
	{
		GSPrimeAcc gspa = new GSPrimeAcc(accNO,accName,charges,isPrime);
		return gspa;
	}
	@Override
	public GSNormalAcc getNewNormalAccount(int accNO,String accName,float charges)
	{
		GSNormalAcc gsna = new GSNormalAcc(accNO,accName,charges);
		return gsna;
	}

}
