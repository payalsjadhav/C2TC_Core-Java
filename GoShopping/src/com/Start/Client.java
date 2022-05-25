package com.Start;

import com.Application.GSNormalAcc;
import com.Application.GSPrimeAcc;
import com.Application.GSShopFactory;

public class Client {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Step1-Step a
		GSShopFactory gssfactory = new GSShopFactory();
				gssfactory.getNewPrimeAccount(123, "Payal", 1000, true);
				gssfactory.getNewNormalAccount(111, "Payal2", 1000);
				
				
				//Step2
				GSPrimeAcc gspa = new GSPrimeAcc();
				gspa.getAccName();
				gspa.getAccNO();
				gspa.getCharges();
				
				//Step5/Step e
				gspa.toString();
				
				//Step3
				GSNormalAcc gsna = new GSNormalAcc();
				gsna.getAccName();
				gsna.getAccNO();
				gsna.getCharges();
				gsna.getDeliveryCharge();
				
				//Step4 /Step d
				gsna.bookProduct(1000);
				//Step 5 /Step e
				gsna.toString();
				}

}
