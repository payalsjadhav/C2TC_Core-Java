package com.Start;

import com.Application.GSNormalAcc;
import com.Application.GSPrimeAcc;
import com.Application.GSShopFactory;

public class Client
{
	public static void main(String[] args)
	{
		GSShopFactory gssfactory = new GSShopFactory();
		gssfactory.getNewPrimeAcc(1189,"Rutik", 499, true);
		gssfactory.getNewNormalAcc(2454,"Harsh" , 899, 40);
		
		GSPrimeAcc gsprime = new GSPrimeAcc();
		gsprime.getAccNm();
		gsprime.getAccNo();
		gsprime.getCharges();
		
		gsprime.bookProduct(5700);
		gsprime.toString();
		
		GSNormalAcc gsnorsmal = new GSNormalAcc();
		gsnorsmal.getAccNm();
		gsnorsmal.getAccNo();
		gsnorsmal.getCharges();
		gsnorsmal.getDeliveryCharges();
		
		gsnorsmal.bookProduct(3249);
		gsnorsmal.toString();
	}
}