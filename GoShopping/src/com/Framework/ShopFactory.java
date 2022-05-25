package com.Framework;

import com.Application.GSNormalAcc;
import com.Application.GSPrimeAcc;

public interface ShopFactory {
    
	public GSPrimeAcc getNewPrimeAcc(int accNO,String accName,float charges,boolean isPrime);
	
	
	public GSNormalAcc getNormalAcc(int accNO,String accName,float charges);

}
